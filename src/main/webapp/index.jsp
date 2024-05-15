<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home | JobPorter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="css/user-styles.css">
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
                    <a class="nav-link" href="#">Jobs</a>
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
        <h1 class="display-4">Trouvez L'emploi ou le Talent de vos Rêves</h1>
        <p class="lead">Que vous soyez à la recherche d'un emploi ou de talents, nous vous guiderons en toute
            simplicité</p>
        <a href="#more-info" class="btn btn-primary btn-lg">Commencer</a>
    </div>
</section>


<section class="services-section bg-light">
    <div class="container">
        <div class="row">
            <div class="col-12 text-center mb-5">
                <h2>Nos Services</h2>
                <p class="lead">Nous offrons une gamme de services pour vous aider à trouver les meilleurs talents et opportunités d'emploi.</p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="service-card">
                    <div class="service-icon">
                        <i class="fas fa-search"></i>
                    </div>
                    <h3>Recherche d'Emploi</h3>
                    <p>Accédez à des milliers d'offres d'emploi dans divers secteurs et trouvez le poste idéal.</p>
                    <a href="#" class="btn btn-primary">Trouvez un Emploi</a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="service-card">
                    <div class="service-icon">
                        <i class="fas fa-users"></i>
                    </div>
                    <h3>Recherche de Talents</h3>
                    <p>Trouvez les meilleurs candidats pour votre entreprise grâce à notre vaste base de données de talents.</p>
                    <a href="#" class="btn btn-primary">Chercher des Talents</a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="service-card">
                    <div class="service-icon">
                        <i class="fas fa-headset"></i>
                    </div>
                    <h3>Support et Conseils</h3>
                    <p>Profitez de notre support et de nos conseils pour optimiser vos recherches et candidatures.</p>
                    <a href="#" class="btn btn-primary">Contactez-nous</a>
                </div>
            </div>
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
                <img src="https://via.placeholder.com/600x400" class="img-fluid" alt="About Us">
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


<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
</body>
</html>