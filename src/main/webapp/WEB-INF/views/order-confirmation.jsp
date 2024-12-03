<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Confirmation</title>
    <link href="https://cdn.jsdelivr.net/npm/uikit@3.16.27/dist/css/uikit.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.16.27/dist/js/uikit.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.16.27/dist/js/uikit-icons.min.js"></script>
</head>
<body class="uk-background-muted uk-padding">

    <!-- Navbar -->
    <nav class="uk-navbar-container uk-margin" uk-navbar>
        <div class="uk-navbar-left">
            <a href="/" class="uk-navbar-item uk-logo">Lipstick Store</a>
        </div>
        <div class="uk-navbar-right">
            <ul class="uk-navbar-nav">
                <li><a href="/lipsticks">Shop</a></li>
                <li><a href="/cart">Cart</a></li>
                <li><a href="/profile">Profile</a></li>
            </ul>
        </div>
    </nav>

    <!-- Order Confirmation Section -->
    <div class="uk-container uk-container-small uk-margin-top">
        <div class="uk-card uk-card-default uk-card-body uk-text-center">
            <h2 class="uk-card-title uk-text-success">Thank You for Your Order!</h2>
            <p>Your order has been placed successfully. A confirmation email has been sent to your email address.</p>
            <p>Order Number: <strong>#<Order getOrderNumber></strong></p>
            <p>Estimated Delivery Date: <strong><order getEstimatedDeliveryDate></strong></p>
        </div>

        <!-- Order Details -->
        <div class="uk-card uk-card-default uk-card-body uk-margin-top">
            <h3 class="uk-card-title">Order Summary</h3>
            <table class="uk-table uk-table-divider">
                <thead>
                    <tr>
                        <th>Item</th>
                        <th>Quantity</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    <OrderItem item : order getItems>
                    <tr>
                        <td><item get ProductName></td>
                        <td><item get Quantity></td>
                        <td><item getTotalPrice></td>
                    </tr>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="2" class="uk-text-right"><strong>Total:</strong></td>
                        <td><strong>$<order get Total Price></strong></td>
                    </tr>
                </tfoot>
            </table>
        </div>

        <!-- Action Buttons -->
        <div class="uk-margin-top uk-text-center">
            <a href="/lipsticks" class="uk-button uk-button-primary">Continue Shopping</a>
            <a href="/profile/orders" class="uk-button uk-button-default">View Order History</a>
        </div>
    </div>

    <!-- Footer -->
    <footer class="uk-section uk-section-secondary uk-light">
        <div class="uk-container">
            <p class="uk-text-center">© 2024 Lipstick Store. All rights reserved.</p>
        </div>
    </footer>

</body>
</html>
