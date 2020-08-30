package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class DataServices {
    @Autowired
    private PostRepositories postRepositories;


    public void createPosts() {

        List<Post> list = new ArrayList<>();
        for (long i = 1; i <= 9; i++) {
            list.add(new Post(i, "title", "descriptionnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
                    , "<p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_1.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <h2 class=\"mb-3\">It is a long established fact a reader be\n" +
                    "                    distracted</h2>\n" +
                    "                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" +
                    "                    Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio\n" +
                    "                    perferendis et doloribus unde architecto optio laboriosam porro\n" +
                    "                    adipisci sapiente officiis nemo accusamus ad praesentium? Esse\n" +
                    "                    minima nisi et. Dolore perferendis, enim praesentium omnis, iste\n" +
                    "                    doloremque quia officia optio deserunt molestiae voluptates soluta\n" +
                    "                    architecto tempora.</p>\n" +
                    "                <p>Molestiae cupiditate inventore animi, maxime sapiente optio,\n" +
                    "                    illo est nemo veritatis repellat sunt doloribus nesciunt! Minima\n" +
                    "                    laborum magni reiciendis qui voluptate quisquam voluptatem soluta\n" +
                    "                    illo eum ullam incidunt rem assumenda eveniet eaque sequi deleniti\n" +
                    "                    tenetur dolore amet fugit perspiciatis ipsa, odit. Nesciunt dolor\n" +
                    "                    minima esse vero ut ea, repudiandae suscipit!</p>\n" +
                    "                <h2 class=\"mb-3 mt-5\">#2. Creative WordPress Themes</h2>\n" +
                    "                <p>Temporibus ad error suscipit exercitationem hic molestiae\n" +
                    "                    totam obcaecati rerum, eius aut, in. Exercitationem atque quidem\n" +
                    "                    tempora maiores ex architecto voluptatum aut officia doloremque.\n" +
                    "                    Error dolore voluptas, omnis molestias odio dignissimos culpa ex\n" +
                    "                    earum nisi consequatur quos odit quasi repellat qui officiis\n" +
                    "                    reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>\n" +
                    "                <p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_1.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <p>Quisquam esse aliquam fuga distinctio, quidem delectus\n" +
                    "                    veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde\n" +
                    "                    aut non tenetur tempore, nisi culpa voluptate maiores officiis\n" +
                    "                    quis vel ab consectetur suscipit veritatis nulla quos quia\n" +
                    "                    aspernatur perferendis, libero sint. Error, velit, porro. Deserunt\n" +
                    "                    minus, quibusdam iste enim veniam, modi rem maiores.</p>\n" +
                    "                <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores\n" +
                    "                    laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga\n" +
                    "                    iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis\n" +
                    "                    porro explicabo soluta commodi libero voluptatem similique id\n" +
                    "                    quidem? Blanditiis voluptates aperiam non magni. Reprehenderit\n" +
                    "                    nobis odit inventore, quia laboriosam harum excepturi ea.</p>\n" +
                    "                <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam\n" +
                    "                    ipsam quidem, dolor distinctio similique asperiores voluptas enim,\n" +
                    "                    exercitationem ratione aut adipisci modi quod quibusdam iusto,\n" +
                    "                    voluptates beatae iure nemo itaque laborum. Consequuntur et\n" +
                    "                    pariatur totam fuga eligendi vero dolorum provident. Voluptatibus,\n" +
                    "                    veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur\n" +
                    "                    recusandae!</p>\n" +
                    "                <p>Voluptas dolores dignissimos dolorum temporibus, autem\n" +
                    "                    aliquam ducimus at officia adipisci quasi nemo a perspiciatis\n" +
                    "                    provident magni laboriosam repudiandae iure iusto commodi debitis\n" +
                    "                    est blanditiis alias laborum sint dolore. Dolores, iure,\n" +
                    "                    reprehenderit. Error provident, pariatur cupiditate soluta\n" +
                    "                    doloremque aut ratione. Harum voluptates mollitia illo minus\n" +
                    "                    praesentium, rerum ipsa debitis, inventore?</p>"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_1.jpg"
                    , null));
        }
        for (long i = 10; i <= 18; i++) {
            list.add(new Post(i, "title", "descriptionnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
                    , "<p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_2.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <h2 class=\"mb-3\">It is a long established fact a reader be\n" +
                    "                    distracted</h2>\n" +
                    "                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" +
                    "                    Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio\n" +
                    "                    perferendis et doloribus unde architecto optio laboriosam porro\n" +
                    "                    adipisci sapiente officiis nemo accusamus ad praesentium? Esse\n" +
                    "                    minima nisi et. Dolore perferendis, enim praesentium omnis, iste\n" +
                    "                    doloremque quia officia optio deserunt molestiae voluptates soluta\n" +
                    "                    architecto tempora.</p>\n" +
                    "                <p>Molestiae cupiditate inventore animi, maxime sapiente optio,\n" +
                    "                    illo est nemo veritatis repellat sunt doloribus nesciunt! Minima\n" +
                    "                    laborum magni reiciendis qui voluptate quisquam voluptatem soluta\n" +
                    "                    illo eum ullam incidunt rem assumenda eveniet eaque sequi deleniti\n" +
                    "                    tenetur dolore amet fugit perspiciatis ipsa, odit. Nesciunt dolor\n" +
                    "                    minima esse vero ut ea, repudiandae suscipit!</p>\n" +
                    "                <h2 class=\"mb-3 mt-5\">#2. Creative WordPress Themes</h2>\n" +
                    "                <p>Temporibus ad error suscipit exercitationem hic molestiae\n" +
                    "                    totam obcaecati rerum, eius aut, in. Exercitationem atque quidem\n" +
                    "                    tempora maiores ex architecto voluptatum aut officia doloremque.\n" +
                    "                    Error dolore voluptas, omnis molestias odio dignissimos culpa ex\n" +
                    "                    earum nisi consequatur quos odit quasi repellat qui officiis\n" +
                    "                    reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>\n" +
                    "                <p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_2.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <p>Quisquam esse aliquam fuga distinctio, quidem delectus\n" +
                    "                    veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde\n" +
                    "                    aut non tenetur tempore, nisi culpa voluptate maiores officiis\n" +
                    "                    quis vel ab consectetur suscipit veritatis nulla quos quia\n" +
                    "                    aspernatur perferendis, libero sint. Error, velit, porro. Deserunt\n" +
                    "                    minus, quibusdam iste enim veniam, modi rem maiores.</p>\n" +
                    "                <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores\n" +
                    "                    laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga\n" +
                    "                    iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis\n" +
                    "                    porro explicabo soluta commodi libero voluptatem similique id\n" +
                    "                    quidem? Blanditiis voluptates aperiam non magni. Reprehenderit\n" +
                    "                    nobis odit inventore, quia laboriosam harum excepturi ea.</p>\n" +
                    "                <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam\n" +
                    "                    ipsam quidem, dolor distinctio similique asperiores voluptas enim,\n" +
                    "                    exercitationem ratione aut adipisci modi quod quibusdam iusto,\n" +
                    "                    voluptates beatae iure nemo itaque laborum. Consequuntur et\n" +
                    "                    pariatur totam fuga eligendi vero dolorum provident. Voluptatibus,\n" +
                    "                    veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur\n" +
                    "                    recusandae!</p>\n" +
                    "                <p>Voluptas dolores dignissimos dolorum temporibus, autem\n" +
                    "                    aliquam ducimus at officia adipisci quasi nemo a perspiciatis\n" +
                    "                    provident magni laboriosam repudiandae iure iusto commodi debitis\n" +
                    "                    est blanditiis alias laborum sint dolore. Dolores, iure,\n" +
                    "                    reprehenderit. Error provident, pariatur cupiditate soluta\n" +
                    "                    doloremque aut ratione. Harum voluptates mollitia illo minus\n" +
                    "                    praesentium, rerum ipsa debitis, inventore?</p>"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_2.jpg"
                    , null));
        }
        for (long i = 19; i <= 27; i++) {
            list.add(new Post(i, "title", "descriptionnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
                    , "<p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_3.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <h2 class=\"mb-3\">It is a long established fact a reader be\n" +
                    "                    distracted</h2>\n" +
                    "                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" +
                    "                    Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio\n" +
                    "                    perferendis et doloribus unde architecto optio laboriosam porro\n" +
                    "                    adipisci sapiente officiis nemo accusamus ad praesentium? Esse\n" +
                    "                    minima nisi et. Dolore perferendis, enim praesentium omnis, iste\n" +
                    "                    doloremque quia officia optio deserunt molestiae voluptates soluta\n" +
                    "                    architecto tempora.</p>\n" +
                    "                <p>Molestiae cupiditate inventore animi, maxime sapiente optio,\n" +
                    "                    illo est nemo veritatis repellat sunt doloribus nesciunt! Minima\n" +
                    "                    laborum magni reiciendis qui voluptate quisquam voluptatem soluta\n" +
                    "                    illo eum ullam incidunt rem assumenda eveniet eaque sequi deleniti\n" +
                    "                    tenetur dolore amet fugit perspiciatis ipsa, odit. Nesciunt dolor\n" +
                    "                    minima esse vero ut ea, repudiandae suscipit!</p>\n" +
                    "                <h2 class=\"mb-3 mt-5\">#2. Creative WordPress Themes</h2>\n" +
                    "                <p>Temporibus ad error suscipit exercitationem hic molestiae\n" +
                    "                    totam obcaecati rerum, eius aut, in. Exercitationem atque quidem\n" +
                    "                    tempora maiores ex architecto voluptatum aut officia doloremque.\n" +
                    "                    Error dolore voluptas, omnis molestias odio dignissimos culpa ex\n" +
                    "                    earum nisi consequatur quos odit quasi repellat qui officiis\n" +
                    "                    reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>\n" +
                    "                <p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_3.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <p>Quisquam esse aliquam fuga distinctio, quidem delectus\n" +
                    "                    veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde\n" +
                    "                    aut non tenetur tempore, nisi culpa voluptate maiores officiis\n" +
                    "                    quis vel ab consectetur suscipit veritatis nulla quos quia\n" +
                    "                    aspernatur perferendis, libero sint. Error, velit, porro. Deserunt\n" +
                    "                    minus, quibusdam iste enim veniam, modi rem maiores.</p>\n" +
                    "                <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores\n" +
                    "                    laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga\n" +
                    "                    iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis\n" +
                    "                    porro explicabo soluta commodi libero voluptatem similique id\n" +
                    "                    quidem? Blanditiis voluptates aperiam non magni. Reprehenderit\n" +
                    "                    nobis odit inventore, quia laboriosam harum excepturi ea.</p>\n" +
                    "                <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam\n" +
                    "                    ipsam quidem, dolor distinctio similique asperiores voluptas enim,\n" +
                    "                    exercitationem ratione aut adipisci modi quod quibusdam iusto,\n" +
                    "                    voluptates beatae iure nemo itaque laborum. Consequuntur et\n" +
                    "                    pariatur totam fuga eligendi vero dolorum provident. Voluptatibus,\n" +
                    "                    veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur\n" +
                    "                    recusandae!</p>\n" +
                    "                <p>Voluptas dolores dignissimos dolorum temporibus, autem\n" +
                    "                    aliquam ducimus at officia adipisci quasi nemo a perspiciatis\n" +
                    "                    provident magni laboriosam repudiandae iure iusto commodi debitis\n" +
                    "                    est blanditiis alias laborum sint dolore. Dolores, iure,\n" +
                    "                    reprehenderit. Error provident, pariatur cupiditate soluta\n" +
                    "                    doloremque aut ratione. Harum voluptates mollitia illo minus\n" +
                    "                    praesentium, rerum ipsa debitis, inventore?</p>"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_3.jpg"
                    , null));
        }
        for (long i = 28; i <= 36; i++) {
            list.add(new Post(i, "title", "descriptionnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
                    , "<p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_4.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <h2 class=\"mb-3\">It is a long established fact a reader be\n" +
                    "                    distracted</h2>\n" +
                    "                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" +
                    "                    Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio\n" +
                    "                    perferendis et doloribus unde architecto optio laboriosam porro\n" +
                    "                    adipisci sapiente officiis nemo accusamus ad praesentium? Esse\n" +
                    "                    minima nisi et. Dolore perferendis, enim praesentium omnis, iste\n" +
                    "                    doloremque quia officia optio deserunt molestiae voluptates soluta\n" +
                    "                    architecto tempora.</p>\n" +
                    "                <p>Molestiae cupiditate inventore animi, maxime sapiente optio,\n" +
                    "                    illo est nemo veritatis repellat sunt doloribus nesciunt! Minima\n" +
                    "                    laborum magni reiciendis qui voluptate quisquam voluptatem soluta\n" +
                    "                    illo eum ullam incidunt rem assumenda eveniet eaque sequi deleniti\n" +
                    "                    tenetur dolore amet fugit perspiciatis ipsa, odit. Nesciunt dolor\n" +
                    "                    minima esse vero ut ea, repudiandae suscipit!</p>\n" +
                    "                <h2 class=\"mb-3 mt-5\">#2. Creative WordPress Themes</h2>\n" +
                    "                <p>Temporibus ad error suscipit exercitationem hic molestiae\n" +
                    "                    totam obcaecati rerum, eius aut, in. Exercitationem atque quidem\n" +
                    "                    tempora maiores ex architecto voluptatum aut officia doloremque.\n" +
                    "                    Error dolore voluptas, omnis molestias odio dignissimos culpa ex\n" +
                    "                    earum nisi consequatur quos odit quasi repellat qui officiis\n" +
                    "                    reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>\n" +
                    "                <p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_4.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <p>Quisquam esse aliquam fuga distinctio, quidem delectus\n" +
                    "                    veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde\n" +
                    "                    aut non tenetur tempore, nisi culpa voluptate maiores officiis\n" +
                    "                    quis vel ab consectetur suscipit veritatis nulla quos quia\n" +
                    "                    aspernatur perferendis, libero sint. Error, velit, porro. Deserunt\n" +
                    "                    minus, quibusdam iste enim veniam, modi rem maiores.</p>\n" +
                    "                <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores\n" +
                    "                    laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga\n" +
                    "                    iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis\n" +
                    "                    porro explicabo soluta commodi libero voluptatem similique id\n" +
                    "                    quidem? Blanditiis voluptates aperiam non magni. Reprehenderit\n" +
                    "                    nobis odit inventore, quia laboriosam harum excepturi ea.</p>\n" +
                    "                <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam\n" +
                    "                    ipsam quidem, dolor distinctio similique asperiores voluptas enim,\n" +
                    "                    exercitationem ratione aut adipisci modi quod quibusdam iusto,\n" +
                    "                    voluptates beatae iure nemo itaque laborum. Consequuntur et\n" +
                    "                    pariatur totam fuga eligendi vero dolorum provident. Voluptatibus,\n" +
                    "                    veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur\n" +
                    "                    recusandae!</p>\n" +
                    "                <p>Voluptas dolores dignissimos dolorum temporibus, autem\n" +
                    "                    aliquam ducimus at officia adipisci quasi nemo a perspiciatis\n" +
                    "                    provident magni laboriosam repudiandae iure iusto commodi debitis\n" +
                    "                    est blanditiis alias laborum sint dolore. Dolores, iure,\n" +
                    "                    reprehenderit. Error provident, pariatur cupiditate soluta\n" +
                    "                    doloremque aut ratione. Harum voluptates mollitia illo minus\n" +
                    "                    praesentium, rerum ipsa debitis, inventore?</p>"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_4.jpg"
                    , null));
        }
        for (long i = 37; i <= 45; i++) {
            list.add(new Post(i, "title", "descriptionnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
                    , "<p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_5.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <h2 class=\"mb-3\">It is a long established fact a reader be\n" +
                    "                    distracted</h2>\n" +
                    "                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" +
                    "                    Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio\n" +
                    "                    perferendis et doloribus unde architecto optio laboriosam porro\n" +
                    "                    adipisci sapiente officiis nemo accusamus ad praesentium? Esse\n" +
                    "                    minima nisi et. Dolore perferendis, enim praesentium omnis, iste\n" +
                    "                    doloremque quia officia optio deserunt molestiae voluptates soluta\n" +
                    "                    architecto tempora.</p>\n" +
                    "                <p>Molestiae cupiditate inventore animi, maxime sapiente optio,\n" +
                    "                    illo est nemo veritatis repellat sunt doloribus nesciunt! Minima\n" +
                    "                    laborum magni reiciendis qui voluptate quisquam voluptatem soluta\n" +
                    "                    illo eum ullam incidunt rem assumenda eveniet eaque sequi deleniti\n" +
                    "                    tenetur dolore amet fugit perspiciatis ipsa, odit. Nesciunt dolor\n" +
                    "                    minima esse vero ut ea, repudiandae suscipit!</p>\n" +
                    "                <h2 class=\"mb-3 mt-5\">#2. Creative WordPress Themes</h2>\n" +
                    "                <p>Temporibus ad error suscipit exercitationem hic molestiae\n" +
                    "                    totam obcaecati rerum, eius aut, in. Exercitationem atque quidem\n" +
                    "                    tempora maiores ex architecto voluptatum aut officia doloremque.\n" +
                    "                    Error dolore voluptas, omnis molestias odio dignissimos culpa ex\n" +
                    "                    earum nisi consequatur quos odit quasi repellat qui officiis\n" +
                    "                    reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>\n" +
                    "                <p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_5.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <p>Quisquam esse aliquam fuga distinctio, quidem delectus\n" +
                    "                    veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde\n" +
                    "                    aut non tenetur tempore, nisi culpa voluptate maiores officiis\n" +
                    "                    quis vel ab consectetur suscipit veritatis nulla quos quia\n" +
                    "                    aspernatur perferendis, libero sint. Error, velit, porro. Deserunt\n" +
                    "                    minus, quibusdam iste enim veniam, modi rem maiores.</p>\n" +
                    "                <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores\n" +
                    "                    laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga\n" +
                    "                    iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis\n" +
                    "                    porro explicabo soluta commodi libero voluptatem similique id\n" +
                    "                    quidem? Blanditiis voluptates aperiam non magni. Reprehenderit\n" +
                    "                    nobis odit inventore, quia laboriosam harum excepturi ea.</p>\n" +
                    "                <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam\n" +
                    "                    ipsam quidem, dolor distinctio similique asperiores voluptas enim,\n" +
                    "                    exercitationem ratione aut adipisci modi quod quibusdam iusto,\n" +
                    "                    voluptates beatae iure nemo itaque laborum. Consequuntur et\n" +
                    "                    pariatur totam fuga eligendi vero dolorum provident. Voluptatibus,\n" +
                    "                    veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur\n" +
                    "                    recusandae!</p>\n" +
                    "                <p>Voluptas dolores dignissimos dolorum temporibus, autem\n" +
                    "                    aliquam ducimus at officia adipisci quasi nemo a perspiciatis\n" +
                    "                    provident magni laboriosam repudiandae iure iusto commodi debitis\n" +
                    "                    est blanditiis alias laborum sint dolore. Dolores, iure,\n" +
                    "                    reprehenderit. Error provident, pariatur cupiditate soluta\n" +
                    "                    doloremque aut ratione. Harum voluptates mollitia illo minus\n" +
                    "                    praesentium, rerum ipsa debitis, inventore?</p>"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_5.jpg"
                    , null));
        }
        for (long i = 46; i <= 48; i++) {
            list.add(new Post(i, "title", "descriptionnnnnnnnnnnnnnnnnnnnnnnn"
                    , "<p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_6.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <h2 class=\"mb-3\">It is a long established fact a reader be\n" +
                    "                    distracted</h2>\n" +
                    "                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" +
                    "                    Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio\n" +
                    "                    perferendis et doloribus unde architecto optio laboriosam porro\n" +
                    "                    adipisci sapiente officiis nemo accusamus ad praesentium? Esse\n" +
                    "                    minima nisi et. Dolore perferendis, enim praesentium omnis, iste\n" +
                    "                    doloremque quia officia optio deserunt molestiae voluptates soluta\n" +
                    "                    architecto tempora.</p>\n" +
                    "                <p>Molestiae cupiditate inventore animi, maxime sapiente optio,\n" +
                    "                    illo est nemo veritatis repellat sunt doloribus nesciunt! Minima\n" +
                    "                    laborum magni reiciendis qui voluptate quisquam voluptatem soluta\n" +
                    "                    illo eum ullam incidunt rem assumenda eveniet eaque sequi deleniti\n" +
                    "                    tenetur dolore amet fugit perspiciatis ipsa, odit. Nesciunt dolor\n" +
                    "                    minima esse vero ut ea, repudiandae suscipit!</p>\n" +
                    "                <h2 class=\"mb-3 mt-5\">#2. Creative WordPress Themes</h2>\n" +
                    "                <p>Temporibus ad error suscipit exercitationem hic molestiae\n" +
                    "                    totam obcaecati rerum, eius aut, in. Exercitationem atque quidem\n" +
                    "                    tempora maiores ex architecto voluptatum aut officia doloremque.\n" +
                    "                    Error dolore voluptas, omnis molestias odio dignissimos culpa ex\n" +
                    "                    earum nisi consequatur quos odit quasi repellat qui officiis\n" +
                    "                    reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>\n" +
                    "                <p class=\"mb-5\">\n" +
                    "                    <img\n" +
                    "                            src=\"/vkhanhqui_myblog_war/resources/homePage/images/image_6.jpg\"\n" +
                    "                            alt=\"\" class=\"img-fluid\">\n" +
                    "                </p>\n" +
                    "                <p>Quisquam esse aliquam fuga distinctio, quidem delectus\n" +
                    "                    veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde\n" +
                    "                    aut non tenetur tempore, nisi culpa voluptate maiores officiis\n" +
                    "                    quis vel ab consectetur suscipit veritatis nulla quos quia\n" +
                    "                    aspernatur perferendis, libero sint. Error, velit, porro. Deserunt\n" +
                    "                    minus, quibusdam iste enim veniam, modi rem maiores.</p>\n" +
                    "                <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores\n" +
                    "                    laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga\n" +
                    "                    iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis\n" +
                    "                    porro explicabo soluta commodi libero voluptatem similique id\n" +
                    "                    quidem? Blanditiis voluptates aperiam non magni. Reprehenderit\n" +
                    "                    nobis odit inventore, quia laboriosam harum excepturi ea.</p>\n" +
                    "                <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam\n" +
                    "                    ipsam quidem, dolor distinctio similique asperiores voluptas enim,\n" +
                    "                    exercitationem ratione aut adipisci modi quod quibusdam iusto,\n" +
                    "                    voluptates beatae iure nemo itaque laborum. Consequuntur et\n" +
                    "                    pariatur totam fuga eligendi vero dolorum provident. Voluptatibus,\n" +
                    "                    veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur\n" +
                    "                    recusandae!</p>\n" +
                    "                <p>Voluptas dolores dignissimos dolorum temporibus, autem\n" +
                    "                    aliquam ducimus at officia adipisci quasi nemo a perspiciatis\n" +
                    "                    provident magni laboriosam repudiandae iure iusto commodi debitis\n" +
                    "                    est blanditiis alias laborum sint dolore. Dolores, iure,\n" +
                    "                    reprehenderit. Error provident, pariatur cupiditate soluta\n" +
                    "                    doloremque aut ratione. Harum voluptates mollitia illo minus\n" +
                    "                    praesentium, rerum ipsa debitis, inventore?</p>"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_6.jpg"
                    , null));
        }
        postRepositories.saveAll(list);
    }
}
