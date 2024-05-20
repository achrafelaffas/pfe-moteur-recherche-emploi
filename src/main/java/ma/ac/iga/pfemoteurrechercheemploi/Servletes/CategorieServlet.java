package ma.ac.iga.pfemoteurrechercheemploi.Servletes;

import ma.ac.iga.pfemoteurrechercheemploi.DAO.CategorieDao;
import ma.ac.iga.pfemoteurrechercheemploi.DAO.CategorieDaoImpl;
import ma.ac.iga.pfemoteurrechercheemploi.entities.Categorie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CategorieServlet")
public class CategorieServlet extends HttpServlet {

    private CategorieDao categorieDao =new CategorieDaoImpl();

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
                request.getRequestDispatcher("/categories.jsp").forward(request, response);
                break;
            case "delete":
                id = Long.parseLong(request.getParameter("id"));
                categorieDao.delete(id);
                response.sendRedirect("CategorieServlet?action=list");
                break;
            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        Categorie categorie=new Categorie();
        switch (action){
            case "save":

                categorie=new Categorie();
                String nom =request.getParameter("nom");
                categorie.setNomCat(nom);

                categorieDao.save(categorie);
                break;
            case "update":

                categorie=new Categorie();
                Long id=Long.parseLong(request.getParameter("id"));
                nom =request.getParameter("nom");

                categorie.setIdCat(id);
                categorie.setNomCat(nom);

                categorieDao.update(categorie);
                break;
            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }

        response.sendRedirect("CategorieServlet?action=list");

    }

}
