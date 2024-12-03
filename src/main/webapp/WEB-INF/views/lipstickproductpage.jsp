<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lipstick Collection</title>

        <!-- Materialize CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" rel="stylesheet">
        <!-- Materialize JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body class="grey lighten-4">
    <!-- Navbar -->
    <nav class="pink">
        <div class="nav-wrapper container">
            <a href="/" class="brand-logo">Lipstick Store</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="/register">Register</a></li>
                <li><a href="/login">Login</a></li>
            </ul>
        </div>
    </nav>
    <!-- Lipstick Grid -->
    <section class="section">
        <div class="container">
            <h1 class="title has-text-centered">Our Lipstick Collection</h1>
            <div class="columns is-multiline">
                <c:forEach var="lipstickproduct" items="${lipstickproductpage}">
                    <div class="column is-two-third">
                        <div class="card">
                            <div class="card-image">
                                <figure class="image is-16by8">
                                    <img src="${lipstickproduct.image_url}" alt="${lipstickproduct.name}" style="width: 100px; height: auto;">
                                </figure>
                            </div>
                            <div class="card-content">
                                <p class="title is-5">${lipstickproduct.name}</p>
                           <!--     <p>${lipstickproduct.description}</p>  -->
                                <p class="is-size-6 has-text-weight-bold">Price: $${lipstickproduct.price}</p>
                                <a href="/lipstick-detail/${lipstickproduct.id}" class="button is-pink mt-3">View Details</a>
                                <a href="/cart/add?lipstickId=${lipstickproduct.id}&quantity=1" class="button is-small is-pink">Add to Cart</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </section>
        <!-- Footer -->
        <footer class="page-footer pink">
            <div class="container">
                <div class="row">
                    <div class="col s12 center-align">
                        <p class="white-text">© 2024 Lipstick Store. All rights reserved.</p>
                    </div>
                </div>
            </div>
        </footer>
</body>
</html>