package py.com.owl.owlapp.controllers.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.com.owl.owlapp.dao.ClienteDao;
import py.com.owl.owlapp.dao.TipoClienteDao;
import py.com.owl.owlapp.domain.Cliente;

@Controller
@Scope("session")
@RequestMapping("cliente")
public class ClienteListController extends ListController<Cliente> {

	@Autowired
	private TipoClienteDao tipoClienteDao;

	@Autowired
	private ClienteDao clienteDao;

	@Override
	public ClienteDao getDao() {
		return clienteDao;
	}

}
