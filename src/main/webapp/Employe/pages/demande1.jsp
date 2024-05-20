<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Offre | JobPorter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<style>
    .hero-section {
        position: relative;
        background-color:#777;
        height: 80vh;
        display: flex;
        justify-content: center;
        align-items: center;
        color: white;
    }
    .hero-section::before {
        content: '';
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        background: rgba(0, 0, 0, 0.8);
    }
</style>
<nav class="navbar navbar-expand-lg bg-dark" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">JobPortal</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Acceuil</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Postuler</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contacter</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><ion-icon name="person-sharp"></ion-icon></a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<section class="hero-section">
    <div class="container my-5">
        <div class="row">
            <div class="col-md-8 offset-md-2">
                <div class="card">
                    <div class="card-header">
                        <h3>Détails de l'offre</h3>
                    </div>
                    <div class="card-body">
                        <h4 id="offre-nom">Developeur Web</h4>
                        <p id="entreprise-nom">IBM</p>
                        <p id="offre-description">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Possimus voluptatum aliquam voluptate sit consequatur quae aspernatur? Maxime deserunt autem aliquam culpa ab, necessitatibus, laudantium, nisi ipsum ad pariatur fugit sint!</p>
                        <button class="btn btn-primary">Postuler</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


<footer class="bg-dark text-light text-center py-4">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <p>&copy; 2024 JobPortal. Tous droits réservés.</p>
            </div>
            <div class="col-md-6">
                <ul class="list-inline social-icons">
                    <li class="list-inline-item"><a href="#">Accueil<i class="fab fa-facebook"></i></a></li>
                    <li class="list-inline-item"><a href="#">Jobs<i class="fab fa-twitter"></i></a></li>
                    <li class="list-inline-item"><a href="#"><i class="fab fa-linkedin"></i></a></li>
                    <li class="list-inline-item"><a href="#"><i class="fab fa-instagram"></i></a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>

<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>