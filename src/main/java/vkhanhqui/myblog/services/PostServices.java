package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestUtils;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
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

    public Post getAPost(long id) {
        return postRepositories.findById(id).get();
    }

    public void deleteAPost(long id) {
        postRepositories.deleteById(id);
    }

    public void createPosts() {
        List<Post> list = new ArrayList<>();
        for (long i = 1; i <= 9; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "https://previews.dropbox.com/p/thumb/AA6_IxZQZXz5myVA-zYEkTkIksvJ1P6yomjBJtDiXkHNShc9Z-zvM-Tx64Dpw6-lSG6lAJgeqqMl1KKFbd0UdpJcpFlkxVhiQoG7knP_W0qKb6EVaAun_pHLhWpu85r-WN1_D-53NN7quuDfPTxi9kpZnVDvB8nNI80kMaOuOhrTBhHC_GcwGOfAwoihOkMhGWw-iWZzndE_c3plngr_6FT5akCat_VUnZZVJbHrWDQOQV9lIvwxKXofwF1NTIpUJllWH-R6DNwsXJAC8KcIo7uJHPRjlFBU915bG7DfrXcbGiPLTyB_A66xZUpr9LxL7kpIUE8AjFstl-NrlAuBZUZ-1zlK3WNtzd64HZ44u4avnw/p.jpeg?fv_content=true&size_mode=5"
                    , "detail", null, null, null));
        }
        for (long i = 10; i <= 18; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "https://previews.dropbox.com/p/thumb/AA5Ch-6q5t1cQYGj-0_-Z6VxKzyRt5wgLRcPTWy1_jyRSqfeIzZXGiH7CY_8vgAvJaq_RLOBkED6gYb5tgFBWoucJOewdV3r722YL2VLNbG5P69LP_M9ZXRyLJqGnETNnWqIjBMFAtvgrnRS59O92GFZs7vls1fO9jhc1T6CCFsRWM0d20Id1d6XMGfu4ip1dG_EZiLn-iK3V4Po6UuCqPSOibPafLuFN_zDuCCIYfrnxLzNTEsmprha28QzgHDWBvpDe7a0cdJGO9_SOZlJk7VZpUpctC8OBtX6TgoOtTQibSTdjPubfBMeaBSV-Ryrr6kdNJ_cMxBRkXgX-tdf1Y6WrNutCCH9alURyeMPFKdeiQ/p.jpeg?fv_content=true&size_mode=5"
                    , "detail", null, null, null));
        }
        for (long i = 19; i <= 27; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "https://previews.dropbox.com/p/thumb/AA7I2yrsVetJds0OhRJQO-t-1R3MhJNYWLxTbCATnqZe534RqMfTjCHtAF75NBAezS2ohh66lDRoYBbFd2_qzKyGd5pYHdd6vtUoqwI1sE7rNcVayTqqUeAFO-SBQGC8i0Qg8m3o_K8aqncgB1ygb9QsPgInCOo8ah1dawACww2_UEr6sE9YwgLMiwJaLr3HafSTlSpbURyn21SOz9fdN4Gxmr5G6LU-uLBq22lEzA90MS3n2hbK4qa4acJM4v3H6hf_KBEviZsFXqMr4DBDT7V1TMc7kitDj9UJ6RBajn58eKm4D-V1p5cm3UiAHD6esOcPaUw_O80ZpSANsETyACQtEHifhrbwE5ZylKbL0dlmGA/p.jpeg?fv_content=true&size_mode=5"
                    , "detail", null, null, null));
        }
        for (long i = 28; i <= 36; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "https://previews.dropbox.com/p/thumb/AA7sawQPirEbso-shZ3RmR6QaDrmtv4-qzy2Zhrpy39rC_xQ8aifhdnePT6CPMYESEdiTWxBJvexyn9FuWh8oxjBm3ysteSELnwkxsGmrl45wMTTXdn3vuB37nXq45YzK7nDvEN2IgN6BxkD4jfuiTUNR0c7OoNwYMwvEl706rBZvA6JXWgstVAU96QwM3vTqkHEuQQEO3SmmAPbWGci5MLHwG76GfZif3ZLb5qdEyBzjMbSinUDdidjnnekdcWS0BBnreSVSrsIQQwJOKtHStpiAr7M6nTWKFRowRTPjuZGZOWZkS9lZrGVh8_-u1hifckP3wciZtdQGA184tRsovWwCBPygChO0wDGg29kHlFVhQ/p.jpeg?fv_content=true&size_mode=5"
                    , "detail", null, null, null));
        }
        for (long i = 37; i <= 45; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "https://previews.dropbox.com/p/thumb/AA5dmhqS9Wk_3mOeEjFKAMW4SC8v-8izBt2a-pV7UAli6gEC3oK0QWYsKwZLOzqjvRbhi34mVdtt2yClyfg5kMAfZHerMvAvsQgYBPi2lHgbZxklIxbhO3nno027FYuVn7mvsbEK-mMiek7sWZJ5ww66ugM_t-OOk-OAdTERYITUgS5kSmYMaKE5UpcwTdrD6mmjp0wWYdVIIboqRq8bi-kqPXtKJp0AQ78jXkRSSqKVXV43z4fWIeUH8ENuVMtPqhZHr_a_aafXOcqd5LbmrUhC1ISjnAN3fWYZLH6u6lOGC32gEzr8X5Ar-KU5GLzH-ZcMhe31bPfloWrdovL8DtGlbZBGC7-51ajOrk7itfoSog/p.jpeg?fv_content=true&size_mode=5"
                    , "detail", null, null, null));
        }
        for (long i = 46; i <= 48; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "https://previews.dropbox.com/p/thumb/AA4pF1Qd7vmYti6pMPGfvXuQ0ga16DBDc8dRTx5ad8wf56AfFoMfpq50HnFPCkZjNZzgWpX4F6agNv3ECb0H_S4nAp7yTWQGJdXSQ7FHRpNieMfbpkGqN9jdjLyZJe25k1bckAo59UvsMqM_pUjxHoQgviB3oN9fX2gtvEKY4oXh2uRNA7HBcb2JS0J7O9MVGBQZOyGlOHdM2EBhCxyKGMKh5-yTCyktpSdP7E8FREmCK3mMqBL_ltBYnB5tsM6r1zTxsA9lrR7PJOMsDe-nP_SdcKKZ7k_zxwlZiJ2HAw1xPnNrXSOTPogSbIiD1iu1vUCBQcf7-Oa7EEGc80MkVd6F3UrkV7UvtUXmGCLCU9i3ew/p.jpeg?fv_content=true&size_mode=5"
                    , "detail", null, null, null));
        }
        postRepositories.saveAll(list);
    }

    public void pagingHomeSite(HttpServletRequest request, ModelMap modelMap) {
        List<Post> posts = postRepositories.findAll();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        int page = ServletRequestUtils.getIntParameter(request, "p", 0);
        pagedListHolder.setPage(page);
        pagedListHolder.setPageSize(5);
        modelMap.put("pagedListHolder", pagedListHolder);
    }

    public void pagingListSite(HttpServletRequest request, ModelMap modelMap) {
        List<Post> posts = postRepositories.findAll();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        int page = ServletRequestUtils.getIntParameter(request, "p", 0);
        pagedListHolder.setPage(page);
        pagedListHolder.setPageSize(9);
        modelMap.put("pagedListHolder", pagedListHolder);
    }
}
