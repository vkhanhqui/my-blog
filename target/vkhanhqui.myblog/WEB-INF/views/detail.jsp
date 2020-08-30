<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>detail</title>
    <jsp:include page="headerDetail.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <%@ page isELIgnored="false" %>
</head>
<body>

<nav
        class="navbar px-md-0 navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-dark"
        id="ftco-navbar">
    <div class="container">
        <a class="navbar-brand" href="/blog/">M<i>e</i>.
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse"
                data-target="#ftco-nav" aria-controls="ftco-nav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="ftco-nav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active"><a href="/vkhanhqui.myblog/" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="list" class="nav-link">Blogs</a></li>
                <li class="nav-item"><a href="contact" class="nav-link">Contact</a></li>
                <li class="nav-item"><a href="login" class="nav-link">Admin-login</a></li>
            </ul>
        </div>
    </div>
</nav>
<!-- END nav -->

<section class="ftco-section ftco-degree-bg" id="content">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 ftco-animate">
                <p class="mb-5">
                    <img
                            src="<c:url value="/resources/homePage/images/image_1.jpg" />"
                            alt="" class="img-fluid">
                </p>
                <h2 class="mb-3">It is a long established fact a reader be
                    distracted</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                    Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio
                    perferendis et doloribus unde architecto optio laboriosam porro
                    adipisci sapiente officiis nemo accusamus ad praesentium? Esse
                    minima nisi et. Dolore perferendis, enim praesentium omnis, iste
                    doloremque quia officia optio deserunt molestiae voluptates soluta
                    architecto tempora.</p>
                <p>Molestiae cupiditate inventore animi, maxime sapiente optio,
                    illo est nemo veritatis repellat sunt doloribus nesciunt! Minima
                    laborum magni reiciendis qui voluptate quisquam voluptatem soluta
                    illo eum ullam incidunt rem assumenda eveniet eaque sequi deleniti
                    tenetur dolore amet fugit perspiciatis ipsa, odit. Nesciunt dolor
                    minima esse vero ut ea, repudiandae suscipit!</p>
                <h2 class="mb-3 mt-5">#2. Creative WordPress Themes</h2>
                <p>Temporibus ad error suscipit exercitationem hic molestiae
                    totam obcaecati rerum, eius aut, in. Exercitationem atque quidem
                    tempora maiores ex architecto voluptatum aut officia doloremque.
                    Error dolore voluptas, omnis molestias odio dignissimos culpa ex
                    earum nisi consequatur quos odit quasi repellat qui officiis
                    reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>
                <p class="mb-5">
                    <img
                            src="<c:url value="/resources/homePage/images/image_2.jpg" />"
                            alt="" class="img-fluid">
                </p>
                <p>Quisquam esse aliquam fuga distinctio, quidem delectus
                    veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde
                    aut non tenetur tempore, nisi culpa voluptate maiores officiis
                    quis vel ab consectetur suscipit veritatis nulla quos quia
                    aspernatur perferendis, libero sint. Error, velit, porro. Deserunt
                    minus, quibusdam iste enim veniam, modi rem maiores.</p>
                <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores
                    laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga
                    iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis
                    porro explicabo soluta commodi libero voluptatem similique id
                    quidem? Blanditiis voluptates aperiam non magni. Reprehenderit
                    nobis odit inventore, quia laboriosam harum excepturi ea.</p>
                <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam
                    ipsam quidem, dolor distinctio similique asperiores voluptas enim,
                    exercitationem ratione aut adipisci modi quod quibusdam iusto,
                    voluptates beatae iure nemo itaque laborum. Consequuntur et
                    pariatur totam fuga eligendi vero dolorum provident. Voluptatibus,
                    veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur
                    recusandae!</p>
                <p>Voluptas dolores dignissimos dolorum temporibus, autem
                    aliquam ducimus at officia adipisci quasi nemo a perspiciatis
                    provident magni laboriosam repudiandae iure iusto commodi debitis
                    est blanditiis alias laborum sint dolore. Dolores, iure,
                    reprehenderit. Error provident, pariatur cupiditate soluta
                    doloremque aut ratione. Harum voluptates mollitia illo minus
                    praesentium, rerum ipsa debitis, inventore?</p>
                <div class="tag-widget post-tag-container mb-5 mt-5">
                    <div class="tagcloud">
                        <a href="#" class="tag-cloud-link">Life</a> <a href="#"
                                                                       class="tag-cloud-link">Sport</a> <a href="#"
                                                                                                           class="tag-cloud-link">Tech</a>
                        <a href="#"
                           class="tag-cloud-link">Travel</a>
                    </div>
                </div>

                <div class="about-author d-flex p-4 bg-light">
                    <div class="bio mr-5">
                        <img
                                src="<c:url value="/resources/homePage/images/person_1.jpg" />"
                                alt="Image placeholder" class="img-fluid mb-4">
                    </div>
                    <div class="desc">
                        <h3>George Washington</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                            Ducimus itaque, autem necessitatibus voluptate quod mollitia
                            delectus aut, sunt placeat nam vero culpa sapiente consectetur
                            similique, inventore eos fugit cupiditate numquam!</p>
                    </div>
                </div>


                <div class="pt-5 mt-5">
                    <h3 class="mb-5">6 Comments</h3>
                    <ul class="comment-list">
                        <li class="comment">
                            <div class="vcard bio">
                                <img
                                        src="<c:url value="/resources/homePage/images/person_1.jpg" />"
                                        alt="Image placeholder">
                            </div>
                            <div class="comment-body">
                                <h3>John Doe</h3>
                                <div class="meta mb-3">November 13, 2019 at 2:21pm</div>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing
                                    elit. Pariatur quidem laborum necessitatibus, ipsam impedit
                                    vitae autem, eum officia, fugiat saepe enim sapiente iste
                                    iure! Quam voluptas earum impedit necessitatibus, nihil?</p>
                                <p>
                                    <a href="#" class="reply">Reply</a>
                                </p>
                            </div>
                        </li>

                        <li class="comment">
                            <div class="vcard bio">
                                <img
                                        src="<c:url value="/resources/homePage/images/person_1.jpg" />"
                                        alt="Image placeholder">
                            </div>
                            <div class="comment-body">
                                <h3>John Doe</h3>
                                <div class="meta mb-3">November 13, 2019 at 2:21pm</div>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing
                                    elit. Pariatur quidem laborum necessitatibus, ipsam impedit
                                    vitae autem, eum officia, fugiat saepe enim sapiente iste
                                    iure! Quam voluptas earum impedit necessitatibus, nihil?</p>
                                <p>
                                    <a href="#" class="reply">Reply</a>
                                </p>
                            </div>

                            <ul class="children">
                                <li class="comment">
                                    <div class="vcard bio">
                                        <img
                                                src="<c:url value="/resources/homePage/images/person_1.jpg" />"
                                                alt="Image placeholder">
                                    </div>
                                    <div class="comment-body">
                                        <h3>John Doe</h3>
                                        <div class="meta mb-3">November 13, 2019 at 2:21pm</div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing
                                            elit. Pariatur quidem laborum necessitatibus, ipsam impedit
                                            vitae autem, eum officia, fugiat saepe enim sapiente iste
                                            iure! Quam voluptas earum impedit necessitatibus, nihil?</p>
                                        <p>
                                            <a href="#" class="reply">Reply</a>
                                        </p>
                                    </div>


                                    <ul class="children">
                                        <li class="comment">
                                            <div class="vcard bio">
                                                <img
                                                        src="<c:url value="/resources/homePage/images/person_1.jpg" />"
                                                        alt="Image placeholder">
                                            </div>
                                            <div class="comment-body">
                                                <h3>John Doe</h3>
                                                <div class="meta mb-3">November 13, 2019 at 2:21pm</div>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing
                                                    elit. Pariatur quidem laborum necessitatibus, ipsam
                                                    impedit vitae autem, eum officia, fugiat saepe enim
                                                    sapiente iste iure! Quam voluptas earum impedit
                                                    necessitatibus, nihil?</p>
                                                <p>
                                                    <a href="#" class="reply">Reply</a>
                                                </p>
                                            </div>

                                            <ul class="children">
                                                <li class="comment">
                                                    <div class="vcard bio">
                                                        <img
                                                                src="<c:url value="/resources/homePage/images/person_1.jpg" />"
                                                                alt="Image placeholder">
                                                    </div>
                                                    <div class="comment-body">
                                                        <h3>John Doe</h3>
                                                        <div class="meta mb-3">November 13, 2019 at 2:21pm</div>
                                                        <p>Lorem ipsum dolor sit amet, consectetur
                                                            adipisicing elit. Pariatur quidem laborum
                                                            necessitatibus, ipsam impedit vitae autem, eum officia,
                                                            fugiat saepe enim sapiente iste iure! Quam voluptas
                                                            earum impedit necessitatibus, nihil?</p>
                                                        <p>
                                                            <a href="#" class="reply">Reply</a>
                                                        </p>
                                                    </div>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li class="comment">
                            <div class="vcard bio">
                                <img
                                        src="<c:url value="/resources/homePage/images/person_1.jpg" />"
                                        alt="Image placeholder">
                            </div>
                            <div class="comment-body">
                                <h3>John Doe</h3>
                                <div class="meta mb-3">November 13, 2019 at 2:21pm</div>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing
                                    elit. Pariatur quidem laborum necessitatibus, ipsam impedit
                                    vitae autem, eum officia, fugiat saepe enim sapiente iste
                                    iure! Quam voluptas earum impedit necessitatibus, nihil?</p>
                                <p>
                                    <a href="#" class="reply">Reply</a>
                                </p>
                            </div>
                        </li>
                    </ul>
                    <!-- END comment-list -->
                    <div class="comment-form-wrap pt-5">
                        <h3 class="mb-5">Leave a comment</h3>
                        <form:form modelAttribute="comment" method="post"
                                   action="/vkhanhqui_myblog_war/detail/save" class="p-5 bg-light">
                            <!-- need to associate this data with post id -->
                            <form:hidden path="id"/>

                            <div class="form-group">
                                <form:label path="creator">Name *</form:label> <form:input type="text"
                                                                                           class="form-control"
                                                                                           path="creator"/>
                            </div>
                            <div class="form-group">
                                <form:label path="content">Content *</form:label>
                                <form:textarea path="content" cols="30" rows="10"
                                               class="form-control"/>
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Post Comment"
                                       class="btn py-3 px-4 btn-primary">
                            </div>
                        </form:form>
                    </div>
                </div>

            </div>
            <!-- .col-md-8 -->
            <div class="col-lg-4 sidebar pl-lg-5 ftco-animate">
                <div class="sidebar-box">
                    <form action="#" class="search-form">
                        <div class="form-group">
                            <span class="icon icon-search"></span> <input type="text"
                                                                          class="form-control"
                                                                          placeholder="Type a keyword and hit enter">
                        </div>
                    </form>
                </div>
                <div class="sidebar-box ftco-animate">
                    <div class="categories">
                        <h3>Categories</h3>
                        <ul class="navbar-nav ml-auto">
                            <li><a href="#">Illustration <span
                                    class="ion-ios-arrow-forward"></span></a></li>
                            <li><a href="#">Branding <span
                                    class="ion-ios-arrow-forward"></span></a></li>
                            <li><a href="#">Application <span
                                    class="ion-ios-arrow-forward"></span></a></li>
                            <li><a href="#">Design <span
                                    class="ion-ios-arrow-forward"></span></a></li>
                            <li><a href="#">Marketing <span
                                    class="ion-ios-arrow-forward"></span></a></li>
                        </ul>
                    </div>
                </div>

                <div class="sidebar-box ftco-animate">
                    <h3>Recent Blog</h3>
                    <div class="block-21 mb-4 d-flex">
                        <a class="blog-img mr-4"
                           style="background-image: url('<c:url
                                   value="/resources/homePage/images/image_1.jpg"/>');"></a>
                        <div class="text">
                            <h3 class="heading">
                                <a href="#">Even the all-powerful Pointing has no control
                                    about the blind texts</a>
                            </h3>
                            <div class="meta">
                                <div>
                                    <a href="#"><span class="icon-calendar"></span> Nov. 14,
                                        2019</a>
                                </div>
                                <div>
                                    <a href="#"><span class="icon-person"></span> Admin</a>
                                </div>
                                <div>
                                    <a href="#"><span class="icon-chat"></span> 19</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="block-21 mb-4 d-flex">
                        <a class="blog-img mr-4"
                           style="background-image: url('<c:url
                                   value="/resources/homePage/images/image_2.jpg"/>');"></a>
                        <div class="text">
                            <h3 class="heading">
                                <a href="#">Even the all-powerful Pointing has no control
                                    about the blind texts</a>
                            </h3>
                            <div class="meta">
                                <div>
                                    <a href="#"><span class="icon-calendar"></span> Nov. 14,
                                        2019</a>
                                </div>
                                <div>
                                    <a href="#"><span class="icon-person"></span> Admin</a>
                                </div>
                                <div>
                                    <a href="#"><span class="icon-chat"></span> 19</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="block-21 mb-4 d-flex">
                        <a class="blog-img mr-4"
                           style="background-image: url(<c:url value="/resources/homePage/images/image_3.jpg"/>);"></a>
                        <div class="text">
                            <h3 class="heading">
                                <a href="#">Even the all-powerful Pointing has no control
                                    about the blind texts</a>
                            </h3>
                            <div class="meta">
                                <div>
                                    <a href="#"><span class="icon-calendar"></span> Nov. 14,
                                        2019</a>
                                </div>
                                <div>
                                    <a href="#"><span class="icon-person"></span> Admin</a>
                                </div>
                                <div>
                                    <a href="#"><span class="icon-chat"></span> 19</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="sidebar-box ftco-animate">
                    <h3>Tag Cloud</h3>
                    <div class="tagcloud">
                        <a href="#" class="tag-cloud-link">cat</a> <a href="#"
                                                                      class="tag-cloud-link">abstract</a> <a href="#"
                                                                                                             class="tag-cloud-link">people</a>
                        <a href="#"
                           class="tag-cloud-link">person</a> <a href="#"
                                                                class="tag-cloud-link">model</a> <a href="#"
                                                                                                    class="tag-cloud-link">delicious</a>
                        <a href="#"
                           class="tag-cloud-link">desserts</a> <a href="#"
                                                                  class="tag-cloud-link">drinks</a>
                    </div>
                </div>

                <div class="sidebar-box ftco-animate">
                    <h3>Paragraph</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                        Ducimus itaque, autem necessitatibus voluptate quod mollitia
                        delectus aut, sunt placeat nam vero culpa sapiente consectetur
                        similique, inventore eos fugit cupiditate numquam!</p>
                </div>
            </div>

        </div>
    </div>
</section>
<!-- .section -->

<footer class="ftco-footer ftco-bg-dark ftco-section">
    <div class="container">
        <div class="row mb-5">
            <div class="col-md">
                <div class="ftco-footer-widget mb-4">
                    <h2 class="logo">
                        <a href="#">Read<span>it</span>.
                        </a>
                    </h2>
                    <p>Far far away, behind the word mountains, far from the
                        countries Vokalia and Consonantia, there live the blind texts.</p>
                    <ul
                            class="ftco-footer-social list-unstyled float-md-left float-lft mt-5">
                        <li class="ftco-animate"><a href="#"><span
                                class="icon-twitter"></span></a></li>
                        <li class="ftco-animate"><a href="#"><span
                                class="icon-facebook"></span></a></li>
                        <li class="ftco-animate"><a href="#"><span
                                class="icon-instagram"></span></a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md">
                <div class="ftco-footer-widget mb-4">
                    <h2 class="ftco-heading-2">latest News</h2>
                    <div class="block-21 mb-4 d-flex">
                        <a class="img mr-4 rounded"
                           style="background-image: url('<c:url
                                   value="/resources/homePage/images/image_1.jpg"/>');"></a>
                        <div class="text">
                            <h3 class="heading">
                                <a href="#">Even the all-powerful Pointing has no control
                                    about</a>
                            </h3>
                            <div class="meta">
                                <div>
                                    <a href="#"><span></span> Oct. 16, 2019</a>
                                </div>
                                <div>
                                    <a href="#"><span></span> Admin</a>
                                </div>
                                <div>
                                    <a href="#"><span></span> 19</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="block-21 mb-4 d-flex">
                        <a class="img mr-4 rounded"
                           style="background-image: url('<c:url
                                   value="/resources/homePage/images/image_2.jpg"/>');"></a>
                        <div class="text">
                            <h3 class="heading">
                                <a href="#">Even the all-powerful Pointing has no control
                                    about</a>
                            </h3>
                            <div class="meta">
                                <div>
                                    <a href="#"><span></span> Oct. 16, 2019</a>
                                </div>
                                <div>
                                    <a href="#"><span></span> Admin</a>
                                </div>
                                <div>
                                    <a href="#"><span></span> 19</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md">
                <div class="ftco-footer-widget mb-4 ml-md-5">
                    <h2 class="ftco-heading-2">Information</h2>
                    <ul class="list-unstyled">
                        <li><a href="#" class="py-1 d-block"><span
                                class="ion-ios-arrow-forward mr-3"></span>Home</a></li>
                        <li><a href="#" class="py-1 d-block"><span
                                class="ion-ios-arrow-forward mr-3"></span>About</a></li>
                        <li><a href="#" class="py-1 d-block"><span
                                class="ion-ios-arrow-forward mr-3"></span>Articles</a></li>
                        <li><a href="#" class="py-1 d-block"><span
                                class="ion-ios-arrow-forward mr-3"></span>Contact</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md">
                <div class="ftco-footer-widget mb-4">
                    <h2 class="ftco-heading-2">Have a Questions?</h2>
                    <div class="block-23 mb-3">
                        <ul>
                            <li><a href="#"><span class="icon icon-map-marker"></span><span
                                    class="text">address</span></a></li>
                            <li><a href="#"><span class="icon icon-phone"></span><span
                                    class="text">phone number</span></a></li>
                            <li><a href="#"><span class="icon icon-envelope"></span><span
                                    class="text">mail</span></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

    </div>
</footer>

<a href="#" class="cd-top"
   style="background-image: url(https://thinhweb.com/wp-content/themes/thinhweb/images/cd-top-arrow.svg);">Back
    To Top</a>


<script
        src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery-migrate-3.0.1.min.js" />"></script>
<script
        src="<c:url value="/resources/js/popper.min.js" />"></script>
<script
        src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.easing.1.3.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.waypoints.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.stellar.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/owl.carousel.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.magnific-popup.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/aos.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.animateNumber.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/scrollax.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/main.js" />"></script>

<script
        src="<c:url value="/resources/homePage/js/backtotop.js" />"></script>

</body>
</html>