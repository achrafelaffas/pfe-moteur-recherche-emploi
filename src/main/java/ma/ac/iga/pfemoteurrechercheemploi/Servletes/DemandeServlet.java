package ma.ac.iga.pfemoteurrechercheemploi.Servletes;

import ma.ac.iga.pfemoteurrechercheemploi.DAO.CategorieDao;
import ma.ac.iga.pfemoteurrechercheemploi.DAO.CategorieDaoImpl;
import ma.ac.iga.pfemoteurrechercheemploi.DAO.DemandeDao;
import ma.ac.iga.pfemoteurrechercheemploi.DAO.DemandeDaoImpl;
import ma.ac.iga.pfemoteurrechercheemploi.entities.Categorie;
import ma.ac.iga.pfemoteurrechercheemploi.entities.Demande;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/DemandeServlet")
public class DemandeServlet extends HttpServlet {

    private DemandeDao demandeDao =new DemandeDaoImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        Long id;

        switch (action) {
            case "list":
                List<Demande> demandes = demandeDao.getAll();
                request.setAttribute("demandes", demandes);
                request.getRequestDispatcher("/demandes.jsp").forward(request, response);
                break;
            /*case "edit":
                id = Long.parseLong(request.getParameter("id"));
                Categorie categorie = categorieDao.find(id);
                request.setAttribute("categorie", categorie);
                request.getRequestDispatcher("/categories.jsp").forward(request, response);
                break;*/
            case "delete":
                id = Long.parseLong(request.getParameter("id"));
                demandeDao.delete(id);
                response.sendRedirect("DemandeServlet?action=list");
                break;
            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
