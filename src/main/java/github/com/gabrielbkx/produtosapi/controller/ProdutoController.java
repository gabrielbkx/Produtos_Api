package github.com.gabrielbkx.produtosapi.controller;


import github.com.gabrielbkx.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/produtos")
public class ProdutoController{


    @PostMapping()
    public Produto  salvar(@RequestBody Produto produto){
        System.out.println("Produto salvo no banco de datos" + produto);
        return produto;
    }




}
