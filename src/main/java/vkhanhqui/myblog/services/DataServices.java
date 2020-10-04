package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.entities.Category;
import vkhanhqui.myblog.models.entities.Post;
import vkhanhqui.myblog.models.entities.Role;
import vkhanhqui.myblog.models.entities.User;
import vkhanhqui.myblog.models.repositories.CategoryRepositories;
import vkhanhqui.myblog.models.repositories.PostRepositories;
import vkhanhqui.myblog.models.repositories.UserRepositories;

import java.util.*;

@Transactional
@Service
public class DataServices {
    @Autowired
    private PostRepositories postRepositories;

    @Autowired
    private CategoryRepositories categoryRepositories;

    @Autowired
    UserRepositories userRepositories;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createPosts() {
        Category category1 = new Category();
        category1.setId((long) 1);
        category1.setName("Illustration");
        categoryRepositories.save(category1);
        Category category2 = new Category();
        category2.setId((long) 2);
        category2.setName("Branding");
        categoryRepositories.save(category2);
        Category category3 = new Category();
        category3.setId((long) 3);
        category3.setName("Application");
        categoryRepositories.save(category3);
        Category category4 = new Category();
        category4.setId((long) 4);
        category4.setName("Design");
        categoryRepositories.save(category4);
        Category category5 = new Category();
        category5.setId((long) 5);
        category5.setName("Marketing");
        categoryRepositories.save(category5);
//      ---------------------------
        User user1 = new User();
        user1.setUsername("1");
        user1.setEmail("1@gmail.com");
        user1.setEnabled(true);
        Role role1 = new Role();
        role1.setAuthority("ROLE_MEMBER");
        Set<Role> roles1 = new HashSet<Role>();
        roles1.add(role1);
        user1.setRoles(roles1);
        user1.setPassword(passwordEncoder.encode("1"));
        userRepositories.save(user1);
//      ---------------------------
        User user2 = new User();
        user2.setUsername("2");
        user2.setEmail("2@gmail.com");
        user2.setEnabled(true);
        Role role2 = new Role();
        role2.setAuthority("ROLE_ADMIN");
        Set<Role> roles2 = new HashSet<Role>();
        roles2.add(role2);
        user2.setRoles(roles2);
        user2.setPassword(passwordEncoder.encode("2"));
        userRepositories.save(user2);
//      ---------------------------
        User user3 = new User();
        user3.setUsername("3");
        user3.setEmail("3@gmail.com");
        user3.setEnabled(true);
        Role role3 = new Role();
        role3.setAuthority("ROLE_MEMBER");
        Set<Role> roles3 = new HashSet<Role>();
        roles3.add(role3);
        user3.setRoles(roles3);
        user3.setPassword(passwordEncoder.encode("3"));
        userRepositories.save(user3);
//      ---------------------------
        List<Post> list = new ArrayList<>();
        for (long i = 1; i <= 9; i++) {
            list.add(new Post(i, "All you want to know about industrial laws" + i, "A small river named Duden flows by their place and supplies it with the necessary regelialia"
                    ,
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
                    , "/resources/images/image_1.jpg", (long) 0
                    , category1, null, user3));
        }
        for (long i = 10; i <= 18; i++) {
            list.add(new Post(i, "All you want to know about industrial laws" + i, "A small river named Duden flows by their place and supplies it with the necessary regelialia"
                    ,
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
                    , "/resources/images/image_2.jpg", (long) 0
                    , category2, null, user1));
        }

        for (long i = 19; i <= 27; i++) {
            list.add(new Post(i, "All you want to know about industrial laws" + i, "A small river named Duden flows by their place and supplies it with the necessary regelialia"
                    ,
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
                    , "/resources/images/image_3.jpg", (long) 0
                    , category3, null, user1));
        }


        for (long i = 28; i <= 36; i++) {
            list.add(new Post(i, "All you want to know about industrial laws" + i, "A small river named Duden flows by their place and supplies it with the necessary regelialia"
                    ,
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
                    , "/resources/images/image_4.jpg", (long) 0
                    , category4, null, user1));
        }

        for (long i = 37; i <= 45; i++) {
            list.add(new Post(i, "All you want to know about industrial laws" + i, "A small river named Duden flows by their place and supplies it with the necessary regelialia"
                    ,
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
                    , "/resources/images/image_5.jpg", (long) 0
                    , category5, null, user1));
        }
        postRepositories.saveAll(list);
    }
}
