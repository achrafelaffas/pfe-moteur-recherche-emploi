<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home | JobPorter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/user-styles.css">
    <link rel="stylesheet" href="/css/employe-styles.css">
</head>
<body>

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
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<section class="hero-section">
    <div class="hero-content">
        <h1 class="display-4">Vous êtes à la recherhce d'un Job?</h1>
        <p class="lead">Accédez à des milliers d'offres d'emploi dans divers secteurs et trouvez le
            poste idéal.</p>
        <a href="#more-info" class="btn btn-primary btn-lg">Commencer</a>
    </div>
</section>

<section class="services-section bg-light">
    <div class="container">
        <div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active" data-bs-interval="10000">
                    <div class="container">
                        <h1>Offre 1</h1>
                        <h2>Nom de l'entreprise</h2>
                        <p>Description de l'offre</p>
                        <a href="#" class="btn btn-lg btn-primary">
                            En savoir plus
                        </a>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="container">
                        <h1>Offre 2</h1>
                        <h2>Nom de l'entreprise</h2>
                        <p>Description de l'offre</p>
                        <a href="#" class="btn btn-lg btn-primary">
                            En savoir plus
                        </a>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="container">
                        <h1>Offre 3</h1>
                        <h2>Nom de l'entreprise</h2>
                        <p>Description de l'offre</p>
                        <a href="#" class="btn btn-lg btn-primary">
                            En savoir plus
                        </a>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="container">
                        <h1>Offre 4</h1>
                        <h2>Nom de l'entreprise</h2>
                        <p>Description de l'offre</p>
                        <a href="#" class="btn btn-lg btn-primary">
                            En savoir plus
                        </a>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>
</section>

<section class="about-us-section py-5">
    <div class="container">
        <div class="row">
            <div class="col-12 text-center mb-4">
                <h2>À Propos de Nous</h2>
                <p class="lead">Découvrez notre mission, notre vision et nos valeurs.</p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <img src="images/a-propos-image.jpg" class="img-fluid" alt="About Us">
            </div>
            <div class="col-md-6">
                <h3>Notre Mission</h3>
                <p>Nous nous engageons à connecter les employeurs avec les meilleurs talents et à aider les candidats à trouver l'emploi de leurs rêves. Nous croyons en l'importance de l'accompagnement et du soutien tout au long du processus de recrutement.</p>
                <h3>Notre Vision</h3>
                <p>Être la plateforme de référence pour la recherche d'emploi et de talents, offrant des solutions innovantes et efficaces pour répondre aux besoins du marché du travail en constante évolution.</p>
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