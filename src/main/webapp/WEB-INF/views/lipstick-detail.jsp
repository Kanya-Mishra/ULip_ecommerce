<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lipstick Details</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>
    <!-- Navbar -->
    <nav class="pink lighten-1">
        <div class="nav-wrapper container">
            <a href="/" class="brand-logo">Lipstick Store</a>
            <ul class="right">
                <li><a href="/cart">Cart</a></li>
                <li><a href="/login">Login</a></li>
                <li><a href="/register">Register</a></li>
            </ul>
        </div>
    </nav>

    <!-- Lipstick Detail Section -->
    <div class="container">
        <div class="row">
            <!-- Image Section -->
            <div class="col s12 m6">
                <img src="${lipstickproduct.image_url}" alt="${lipstickproduct.name}" class="responsive-img z-depth-3">
            </div>

            <!-- Details Section -->
            <div class="col s12 m6">
                <h4 class="pink-text text-darken-2">${lipstickproduct.name}</h4>
                <p>${lipstickproduct.description}</p>
                <h5 class="pink-text text-darken-4">Price: $${lipstickproduct.price}</h5>
                <!-- Add to Cart Button -->
                <form action="/cart/add" method="post">
                    <input type="hidden" name="lipstickId" value="${lipstickproduct.id}">
                    <div class="input-field">
                        <label for="quantity">Quantity</label>
                        <input type="number" id="quantity" name="quantity" value="1" min="1" class="validate">
                    </div>
                    <button type="submit" class="btn pink lighten-1 waves-effect waves-light">Add to Cart</button>
                </form>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer class="page-footer pink lighten-1">
        <div class="container">
            <div class="row">
                <div class="col s12">
                    <p class="white-text center-align">© 2024 Lipstick Store. All rights reserved.</p>
                </div>
            </div>
        </div>
    </footer>
</body>
</html>
