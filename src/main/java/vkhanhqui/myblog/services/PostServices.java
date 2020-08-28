package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import java.util.List;

@Transactional
@Service
public class PostServices {
    @Autowired
    private PostRepositories postRepositories;

    public List<Post> getPosts() {
        return postRepositories.findAll();
    }

    public void saveAPost(Post post) {
        postRepositories.save(post);
    }

    public Post getAPost(int id) {
        return postRepositories.findById(id).get();
    }

    public void deleteAPost(int id) {
        postRepositories.deleteById(id);
    }

//    public void createPosts(){
//        List<Post> list = new ArrayList<>();
//        for (int i = 1; i <= 9; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "https://previews.dropbox.com/p/thumb/AA6_IxZQZXz5myVA-zYEkTkIksvJ1P6yomjBJtDiXkHNShc9Z-zvM-Tx64Dpw6-lSG6lAJgeqqMl1KKFbd0UdpJcpFlkxVhiQoG7knP_W0qKb6EVaAun_pHLhWpu85r-WN1_D-53NN7quuDfPTxi9kpZnVDvB8nNI80kMaOuOhrTBhHC_GcwGOfAwoihOkMhGWw-iWZzndE_c3plngr_6FT5akCat_VUnZZVJbHrWDQOQV9lIvwxKXofwF1NTIpUJllWH-R6DNwsXJAC8KcIo7uJHPRjlFBU915bG7DfrXcbGiPLTyB_A66xZUpr9LxL7kpIUE8AjFstl-NrlAuBZUZ-1zlK3WNtzd64HZ44u4avnw/p.jpeg?fv_content=true&size_mode=5"
//                    , "detail", null, null, null));
//        }
//        for (int i = 10; i <= 18; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "https://previews.dropbox.com/p/thumb/AA5Ch-6q5t1cQYGj-0_-Z6VxKzyRt5wgLRcPTWy1_jyRSqfeIzZXGiH7CY_8vgAvJaq_RLOBkED6gYb5tgFBWoucJOewdV3r722YL2VLNbG5P69LP_M9ZXRyLJqGnETNnWqIjBMFAtvgrnRS59O92GFZs7vls1fO9jhc1T6CCFsRWM0d20Id1d6XMGfu4ip1dG_EZiLn-iK3V4Po6UuCqPSOibPafLuFN_zDuCCIYfrnxLzNTEsmprha28QzgHDWBvpDe7a0cdJGO9_SOZlJk7VZpUpctC8OBtX6TgoOtTQibSTdjPubfBMeaBSV-Ryrr6kdNJ_cMxBRkXgX-tdf1Y6WrNutCCH9alURyeMPFKdeiQ/p.jpeg?fv_content=true&size_mode=5"
//                    , "detail", null, null, null));
//        }
//        for (int i = 19; i <= 27; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "https://previews.dropbox.com/p/thumb/AA7I2yrsVetJds0OhRJQO-t-1R3MhJNYWLxTbCATnqZe534RqMfTjCHtAF75NBAezS2ohh66lDRoYBbFd2_qzKyGd5pYHdd6vtUoqwI1sE7rNcVayTqqUeAFO-SBQGC8i0Qg8m3o_K8aqncgB1ygb9QsPgInCOo8ah1dawACww2_UEr6sE9YwgLMiwJaLr3HafSTlSpbURyn21SOz9fdN4Gxmr5G6LU-uLBq22lEzA90MS3n2hbK4qa4acJM4v3H6hf_KBEviZsFXqMr4DBDT7V1TMc7kitDj9UJ6RBajn58eKm4D-V1p5cm3UiAHD6esOcPaUw_O80ZpSANsETyACQtEHifhrbwE5ZylKbL0dlmGA/p.jpeg?fv_content=true&size_mode=5"
//                    , "detail", null, null, null));
//        }
//        for (int i = 28; i <= 36; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "https://ucb74bfb08d6bc225c103a574b61.previews.dropboxusercontent.com/p/thumb/AA4hraqTcbHMtdDjnPnaNe9AL-MUAPPB3iM6Zr1YdCZMguxO8R44wCTFB84JhA8cq44dGnmVPZyrDo4OeoySy2H5kQCItjne56zcVjFCAi6bnbNKCrdPfTx4QL8Rn2JbVNJSBTmN7OnJWGS2otEeNhXetHZ7PFsNpKfYr-tMGErWM0IOsQnjSsSqMV3xMqB5zCgrzRvV7KvIegcsJvX8GFf7yv0mBCRWCAA6TwxW1jZbWyYt2ZXuopH63AwN8RgXKLezjK3Ge9RSP7SsPvTIEuxWi2IzBJcCExnA2RtjupJeAtHFdByfXL81rx8pIQNZ2cJ9yoWQPrJIIXAR3S_xQ-aPwUWmo5Co6CCDjhKJMIdY9w/p.jpeg?fv_content=true&size_mode=5"
//                    , "detail", null, null, null));
//        }
//        for (int i = 37; i <= 45; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "https://uc2f9906c27154dca2615423f03e.previews.dropboxusercontent.com/p/thumb/AA6HGNjTyS2nOzS-tP_jY3wpIskHbgyVUYQuBJIItVB_sSRkejVGlmM5kZAmP0-QJMVAI5vgwa_csiccvbtDNkmItEwobILZpIOqeRFK3hRbWppmSutv18KbAm9csldCRYFJ0xyNbB4RsoKAL0mEYJ1_d9QMAPTR5xz2Et-4lHjupSEgBiea5cyXlFK_ItVd2pu0Cmkdnfy33RN_23MZetKLYLgyZFe3qQPeQeRYonZNURLR2uekw7GTM_bEYG2_428G5mhOdTR4YwLLFkg7TlqL4nHUofhlqoYUxlAY-KAcMiTSEcnHS50VYCiLBxPEkmcBmGhxIzPxMW1QFtM5weEmyPLDpQ-UzAdeRbrI5clejQ/p.jpeg?fv_content=true&size_mode=5"
//                    , "detail", null, null, null));
//        }
//        for (int i = 46; i <= 48; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "https://ucf5508026565563881b87a0d36c.previews.dropboxusercontent.com/p/thumb/AA7E-nlKrOq5j0E4yHDMcRXnOSbojFfPb6g8nAvWbue-sxkoT1koD9DzO_hI67VzIA2W7E2YkZqNBcunX5Gx0yjXmjgz2Fr-WB4eBR5oQPYiBw9xfAaB9bS7eT4sqUuR4Jz506M-GtaBsgPSRRsJ1ryR4P6MDawyb-O5pSbIIkHwdfYcSmPytNAaYNEW0hD1LzFJOjFg6PIogJ7EJSlnBLtQX4hZgVfO1Ov5ceiPdfiRX16uhkLFptjTW5bxVqEtHZIWqtMn_l9lAooW7M6x4ZUdb3Jb3YCTSejDJ-Se6crOswk26Dh0wN2JTIerwCGEFtks9TYSERspEcEFMTmVMe8O8A1Sm4HljtlkDkZihteqlg/p.jpeg?fv_content=true&size_mode=5"
//                    , "detail", null, null, null));
//        }
//        postRepositories.saveAll(list);
//    }
}
