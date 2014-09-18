package be.mediasoft.example.web.controller;

import be.mediasoft.example.domain.ProductDTO;
import be.mediasoft.example.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController class. Used for mapping request
 *  to product list/detail.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Show list.
     * @return ModelAndView model and view
     */
    @RequestMapping("/product/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("list");
        mv.getModel().put("title", "Lijst met producten");
        mv.getModel().put("products", productService.findAllProducts());
        return mv;
    }

    /**
     * Show detail.
     * @param id the id to show
     * @return ModelAndView model and view
     */
    @RequestMapping("/product/detail")
    public ModelAndView detail(@RequestParam("uuid") String id) {
        ModelAndView mv = new ModelAndView("detail");
        mv.getModel().put("product", productService.findProductById(id));
        return mv;
    }

}
