<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Fitness World Gym</title>

    <style>
        body, h1, h2, p, ul {
            margin: 0;
            padding: 0;
        }

        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            color: #333;
        }

        header {
            background: #333;
            color: #fff;
            padding: 1rem 0;
        }

        header .container {
            display: flex;
            justify-content: space-between;
            align-items: center;
            width: 90%;
            max-width: 1200px;
            margin: 0 auto;
        }

        header h1 {
            margin: 0;
        }

        nav ul {
            list-style: none;
            display: flex;
            gap: 1rem;
        }

        nav a {
            color: #fff;
            text-decoration: none;
        }

        nav a:hover {
            text-decoration: underline;
        }

        .hero {
            background: url('gym-hero.jpg') no-repeat center center/cover;
            color: #fff;
            text-align: center;
            padding: 4rem 0;
        }

        .hero-content {
            background: rgba(0, 0, 0, 0.5);
            padding: 2rem;
            border-radius: 8px;
            display: inline-block;
        }

        .cta-button {
            background: #e94e77;
            color: #fff;
            padding: 0.75rem 1.5rem;
            text-decoration: none;
            border-radius: 4px;
            font-weight: bold;
        }

        .cta-button:hover {
            background: #d43f6c;
        }

        .info-section {
            padding: 2rem 0;
            background: #f4f4f4;
        }

        .info-section:nth-child(even) {
            background: #fff;
        }

        .info-section .container {
            width: 90%;
            max-width: 1200px;
            margin: 0 auto;
        }

        .signup-section {
            background: #e94e77;
            color: #fff;
            text-align: center;
            padding: 2rem 0;
        }

        footer {
            background: #333;
            color: #fff;
            padding: 1rem 0;
            text-align: center;
        }

        footer p {
            margin: 0;
        }
    </style
</head>
<body>
    <header>
        <div class="container">
            <h1>Welcome to FitLife Gym</h1>
            <nav>
                <ul>
                    <li><a href="/Registration" class="cta-button">Sign Up</a></li>
                    <li><a href="/login" class="cta-button">Log In</a></li>
                </ul>
            </nav>
        </div>
    </header>

    <main>
        <section class="hero">
            <div class="hero-content">
                <h2>Your Journey to Fitness Begins Here</h2>
                <p>Join us for a healthier, stronger you. Discover our state-of-the-art facilities and personalized fitness plans.</p>
            </div>
        </section>

        <section id="about" class="info-section">
            <div class="container">
                <h2>About Us</h2>
                <p>At FitLife Gym, we are committed to helping you achieve your fitness goals. Our experienced trainers and modern equipment ensure that every workout is effective and enjoyable.</p>
            </div>
        </section>

        <section id="classes" class="info-section">
            <div class="container">
                <h2>Our Classes</h2>
                <ul>
                    <li>Yoga</li>
                    <li>HIIT</li>
                    <li>Pilates</li>
                    <li>Strength Training</li>
                    <li>Cardio</li>
                </ul>
            </div>
        </section>

        <section id="contact" class="info-section">
            <div class="container">
                <h2>Contact Us</h2>
                <p>Address: 123 FitLife Ave, Fitness City, FC 45678</p>
                <p>Email: info@fitlifegym.com</p>
                <p>Phone: (123) 456-7890</p>
            </div>
        </section>

        <section id="signup" class="signup-section">
            <div class="container">
                <h2>Ready to Join?</h2>
                <p>Fill out our online form to get started on your fitness journey!</p>
                <a href="signup.html" class="cta-button">Sign Up</a>
            </div>
        </section>
    </main>

    <footer>
        <div class="container">
            <p>&copy; 2024 FitLife Gym. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>
