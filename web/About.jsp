<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/about.css" rel="stylesheet" type="text/css"/>
        <style>
            .about {
                font-family: sans-serif;
            }

            .about .about-head {
                font-size: 32px;
                font-weight: 500;
                text-align: center;
            }


            .about .about-body {
                text-align: justify;
            }
            
            .color-green {
                color: #28a745;
                text-decoration: underline;
            }
        </style>
    </head>
    <body>
        <jsp:include page="Menu.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a class="color-green" href="/blog/home">Home</a></li>
                                <li class="breadcrumb-item"><a class="color-green" href="#">Topic</a></li>
                                <li class="breadcrumb-item active" aria-current="#"><a class="color-green" href="#">Sub-topic</a></li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                <jsp:include page="Left.jsp"></jsp:include>

                    <div class="col-sm-9">
                        <div class="row">
                            <div class="about">
                                <table border="0">
                                    <thead>
                                        <tr>
                                            <th class="about-head">About Us</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td><p class="about-body">Welcome to our technology blog, where we dive deep into the ever-evolving world of programming languages, technology news, and insightful tutorials to help you navigate the digital landscape with confidence and expertise. <br>

                                                    In today's fast-paced technological era, staying updated with the latest trends, news, and advancements in programming languages is essential for any aspiring developer or seasoned professional. Whether you're a coding enthusiast looking to expand your skill set, a student venturing into the world of software development, or a seasoned programmer seeking to sharpen your expertise, our blog is your go-to resource for all things tech-related. <br>

                                                    At <a class="color-green" href="/blog/home">Geek Hub</a>, we are passionate about exploring the diverse spectrum of programming languages, from the foundational classics to the cutting-edge innovations shaping the future of software development. Through our in-depth articles, tutorials, and guides, we aim to empower our readers with the knowledge and tools they need to excel in their programming journey. <br>

                                                    But our blog is not just about programming languages; it's also a hub for the latest news and insights from the dynamic world of technology. From breakthrough innovations and industry trends to thought-provoking analyses and expert perspectives, we strive to keep you informed and inspired with our curated selection of tech news and updates. <br>

                                                    Moreover, we understand that learning programming can sometimes feel daunting, which is why we've curated a comprehensive collection of tutorials and resources to support learners at every stage of their journey. Whether you're a beginner taking your first steps in coding or an experienced developer honing your skills in a new language or framework, our tutorials offer step-by-step guidance and practical tips to help you master the art of programming.<br>

                                                    So, whether you're looking to stay ahead of the curve with the latest programming languages, stay informed about the latest tech trends, or enhance your coding skills through practical tutorials, <a class="color-green" href="/blog/home">Geek Hub</a> is your ultimate destination for all things tech. Join us as we embark on an exciting journey through the ever-expanding realm of technology, one line of code at a time.</p></td>
                                        </tr>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>

                </div>
            </div>

        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>

