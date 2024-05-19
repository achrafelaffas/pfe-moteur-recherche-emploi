package ma.ac.iga.pfemoteurrechercheemploi.Servletes;

import ma.ac.iga.pfemoteurrechercheemploi.DAO.CategorieDao;
import ma.ac.iga.pfemoteurrechercheemploi.DAO.CategorieDaoImpl;
import ma.ac.iga.pfemoteurrechercheemploi.DAO.OffreDao;
import ma.ac.iga.pfemoteurrechercheemploi.DAO.OffreDaoImpl;
import ma.ac.iga.pfemoteurrechercheemploi.entities.Categorie;
import ma.ac.iga.pfemoteurrechercheemploi.entities.Offres;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/OffreServlet")

public class OffreServlet extends HttpServlet {
    private OffreDao offreDao=new OffreDaoImpl();
    private CategorieDao categorieDao=new CategorieDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        Long id;



        switch (action) {
            case "list":
                List<Categorie> categories = categorieDao.getAll();
                request.setAttribute("categories", categories);
                List<Offres> offres = offreDao.getAll();
                request.setAttribute("offres", offres);
                request.getRequestDispatcher("/offres.jsp").forward(request, response);
                break;
            case "delete":
                id = Long.parseLong(request.getParameter("id"));
                offreDao.delete(id);
                response.sendRedirect("OffreServlet?action=list");
                break;
            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action){
            case "save":


                String description =request.getParameter("Description");
                String nom =request.getParameter("nom");
                String specialite =request.getParameter("Specialite");
                String mission =request.getParameter("Mission");
                Long categorieId = Long.parseLong(request.getParameter("Categorie"));
                int annExp =Integer.parseInt(request.getParameter("nbAnExp"));
                int NBRcrut =Integer.parseInt(request.getParameter("NbRec"));
                String ville =request.getParameter("ville");
                Double salaire =Double.parseDouble(request.getParameter("Salaire"));

                Categorie categorie = categorieDao.find(categorieId);

                Offres offre=new Offres();

                offre.setDescription(description);
                offre.setNomOffre(nom);
                offre.setSpecialite(specialite);
                offre.setMission(mission);
                offre.setCategorie(categorie);
                offre.setAnneeExperience(annExp);
                offre.setNbRecruter(NBRcrut);
                offre.setVilleTravail(ville);
                offre.setSalaire(salaire);

                offreDao.save(offre);
                break;
            case "update":
                Long id=Long.parseLong(request.getParameter("id"));
                description =request.getParameter("Description");
                nom=request.getParameter("nom");
                specialite =request.getParameter("Specialite");
                mission =request.getParameter("Mission");
                categorieId = Long.parseLong(request.getParameter("Categorie"));
                annExp =Integer.parseInt(request.getParameter("nbAnExp"));
                NBRcrut =Integer.parseInt(request.getParameter("NbRec"));
                ville =request.getParameter("ville");
                salaire =Double.parseDouble(request.getParameter("Salaire"));

                categorie = categorieDao.find(categorieId);
                offre=new Offres();
                offre.setIdOffre(id);
                offre.setNomOffre(nom);
                offre.setDescription(description);
                offre.setSpecialite(specialite);
                offre.setMission(mission);
                offre.setCategorie(categorie);
                offre.setAnneeExperience(annExp);
                offre.setNbRecruter(NBRcrut);
                offre.setVilleTravail(ville);
                offre.setSalaire(salaire);

               offreDao.update(offre);
                break;
            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }

        response.sendRedirect("OffreServlet?action=list");

    }
    }

