<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100">
    <!-- Navbar -->
    <nav class="bg-pink-500 text-white">
        <div class="container mx-auto flex justify-between items-center py-4 px-6">
            <a href="/" class="text-2xl font-bold">Lipstick Store</a>
            <div>
                <a href="/cart" class="mr-4">Cart</a>
                <a href="/login">Login</a>
            </div>
        </div>
    </nav>

    <!-- Checkout Form -->
    <div class="container mx-auto my-10 p-6 bg-white shadow-lg rounded-lg">
        <h1 class="text-3xl font-bold text-gray-800 mb-6">Checkout</h1>

        <form action="/checkout" method="post">
            <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                <!-- Shipping Information -->
                <div>
                    <h2 class="text-xl font-semibold text-gray-700 mb-4">Shipping Information</h2>
                    <div class="mb-4">
                        <label for="fullName" class="block text-sm font-medium text-gray-600">Full Name</label>
                        <input type="text" id="fullName" name="fullName" class="w-full mt-1 px-4 py-2 border rounded-md focus:ring-pink-500 focus:border-pink-500">
                    </div>
                    <div class="mb-4">
                        <label for="address" class="block text-sm font-medium text-gray-600">Address</label>
                        <input type="text" id="address" name="address" class="w-full mt-1 px-4 py-2 border rounded-md focus:ring-pink-500 focus:border-pink-500">
                    </div>
                    <div class="mb-4">
                        <label for="city" class="block text-sm font-medium text-gray-600">City</label>
                        <input type="text" id="city" name="city" class="w-full mt-1 px-4 py-2 border rounded-md focus:ring-pink-500 focus:border-pink-500">
                    </div>
                    <div class="mb-4">
                        <label for="zipCode" class="block text-sm font-medium text-gray-600">Zip Code</label>
                        <input type="text" id="zipCode" name="zipCode" class="w-full mt-1 px-4 py-2 border rounded-md focus:ring-pink-500 focus:border-pink-500">
                    </div>
                </div>

                <!-- Billing Information -->
                <div>
                    <h2 class="text-xl font-semibold text-gray-700 mb-4">Billing Information</h2>
                    <div class="mb-4">
                        <label for="cardName" class="block text-sm font-medium text-gray-600">Name on Card</label>
                        <input type="text" id="cardName" name="cardName" class="w-full mt-1 px-4 py-2 border rounded-md focus:ring-pink-500 focus:border-pink-500">
                    </div>
                    <div class="mb-4">
                        <label for="cardNumber" class="block text-sm font-medium text-gray-600">Card Number</label>
                        <input type="text" id="cardNumber" name="cardNumber" class="w-full mt-1 px-4 py-2 border rounded-md focus:ring-pink-500 focus:border-pink-500">
                    </div>
                    <div class="mb-4">
                        <label for="expiration" class="block text-sm font-medium text-gray-600">Expiration Date</label>
                        <input type="text" id="expiration" name="expiration" placeholder="MM/YY" class="w-full mt-1 px-4 py-2 border rounded-md focus:ring-pink-500 focus:border-pink-500">
                    </div>
                    <div class="mb-4">
                        <label for="cvv" class="block text-sm font-medium text-gray-600">CVV</label>
                        <input type="text" id="cvv" name="cvv" class="w-full mt-1 px-4 py-2 border rounded-md focus:ring-pink-500 focus:border-pink-500">
                    </div>
                </div>
            </div>

            <!-- Order Summary -->
            <div class="mt-8">
                <h2 class="text-xl font-semibold text-gray-700 mb-4">Order Summary</h2>
                <div class="p-4 border rounded-lg bg-gray-50">
                    <c:forEach var="item" items="cart Items">
                        <div class="flex justify-between py-2">
                            <span>item MAC Glossy Lipstick item quantity</span>
                            <span>item MAC Glossy Lipstick price * item quantity</span>
                        </div>
                    </c:forEach>
                    <div class="flex justify-between font-semibold text-gray-800 py-2 border-t mt-4">
                        <span>Total</span>
                        <span>cartTotal</span>
                    </div>
                </div>
            </div>

            <!-- Submit Button -->
            <div class="mt-6">
                <button type="submit" class="w-full bg-pink-500 text-white py-3 rounded-lg text-lg font-semibold hover:bg-pink-600">Place Order</button>
            </div>
        </form>
    </div>

    <!-- Footer -->
    <footer class="bg-gray-800 text-gray-400 py-6">
        <div class="container mx-auto text-center">
            <p>© 2024 Lipstick Store. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>
