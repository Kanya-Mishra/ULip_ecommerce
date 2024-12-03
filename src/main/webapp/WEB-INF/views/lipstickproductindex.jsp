<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lipstick Store</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css">
</head>
<body>
    <!-- Hero Section -->
    <section class="hero is-medium is-pink">
        <div class="hero-body has-text-centered">
            <div class="container">
                <h1 class="title has-text-white">Welcome to Lipstick Store</h1>
                <p class="subtitle has-text-light">Discover your perfect lipstick today!</p>
                <a href="/lipsticks" class="button is-white is-medium">Shop Now</a>
            </div>
        </div>
    </section>

    <!-- Featured Categories -->
    <section class="section">
        <div class="container">
            <h2 class="title has-text-centered">Featured Categories</h2>
            <div class="columns is-multiline">
                <div class="column is-one-third">
                    <div class="box has-text-centered">
                        <h3 class="title is-5">Matte Lipsticks</h3>
                        <p>Long-lasting and vibrant shades.</p>
                        <a href="/category/matte" class="button is-pink">Explore</a>
                    </div>
                </div>
                <div class="column is-one-third">
                    <div class="box has-text-centered">
                        <h3 class="title is-5">Glossy Lipsticks</h3>
                        <p>Add a touch of shine to your lips.</p>
                        <a href="/category/glossy" class="button is-pink">Explore</a>
                    </div>
                </div>
                <div class="column is-one-third">
                    <div class="box has-text-centered">
                        <h3 class="title is-5">Vegan Lipsticks</h3>
                        <p>Cruelty-free and eco-friendly.</p>
                        <a href="/category/vegan" class="button is-pink">Explore</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>
</html>