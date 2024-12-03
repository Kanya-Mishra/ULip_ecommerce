<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping Cart</title>
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
                <li><a href="/lipstickpage">Lipsticks</a></li>
                <li><a href="/login">Login</a></li>
                <li><a href="/register">Register</a></li>
            </ul>
        </div>
    </nav>
</head>
    <!-- Shopping Cart Section -->
    <div class="grid-container">
        <h1 class="text-center">Your Shopping Cart</h1>

        <c:if test="${empty cartItems}">
            <p class="text-center">Your cart is empty. <a href="/lipstickpage">Browse products</a>.</p>
        </c:if>

        <c:if test="${not empty cartItems}">
            <table class="stack hover">
                <table class="stack hover">
                    <thead>
                        <tr>
                            <th>Product</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${cartItems}">
                            <tr>
                                <td>
                                    <img src="${item.lipstickproduct.image_url}" alt="${item.lipstickproduct.name}" style="width: 50px; height: 50px;">
                                    <span>${item.lipstickproduct.name}</span>
                                </td>
                                <td><fmt:formatNumber value="${item.lipstickproduct.price}" type="currency" /></td>
                                <td>
                                    <form action="/cart/update" method="post" style="display: inline;">
                                        <input type="hidden" name="lipstickId" value="${item.lipstickproduct.id}">
                                        <input type="number" name="quantity" value="${item.quantity}" min="1" class="input-group-field">
                                        <button type="submit" class="button tiny">Update</button>
                                    </form>
                                </td>
                                <td><fmt:formatNumber value="${item.lipstickproduct.price * item.quantity}" type="currency" /></td>
                                <td>
                                    <form action="/cart/remove" method="post" style="display: inline;">
                                        <input type="hidden" name="lipstickId" value="${item.lipstickproduct.id}">
                                        <button type="submit" class="alert button tiny">Remove</button>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            <div class="grid-x grid-padding-x align-right">
                <div class="cell small-12 medium-6 large-4">
                    <h4>Total: $${cartTotal}</h4>
                    <a href="/checkout" class="button success expanded">Proceed to Checkout</a>
                </div>
            </div>
        </c:if>
    </div>

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
