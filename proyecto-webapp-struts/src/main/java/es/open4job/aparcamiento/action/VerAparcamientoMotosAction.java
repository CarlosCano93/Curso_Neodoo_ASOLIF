package es.open4job.aparcamiento.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import es.open4job.web.DAO.AparcamientoMotoDAO;
import es.open4job.web.VO.AparcamientoMotoVO;

public class VerAparcamientoMotosAction extends Action {

	public VerAparcamientoMotosAction() {
		// TODO Auto-generated constructor stub
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		AparcamientoMotoDAO aparcamientoMotoDAO = new AparcamientoMotoDAO();

		List<AparcamientoMotoVO> motos = aparcamientoMotoDAO
				.getLstAparcamientoMoto();

		// añade el objeto al request para enviarlo al jsp
		request.setAttribute("motos", motos);

		// busca en struts.config.xml el success_moto para abrir esa pagina jsp
		return mapping.findForward("success_moto");

	}

}
