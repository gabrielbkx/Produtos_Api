package github.com.gabrielbkx.produtosapi.repository;

import github.com.gabrielbkx.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
