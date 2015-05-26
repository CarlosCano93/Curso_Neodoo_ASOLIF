package es.open4job.aparcamiento.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import es.open4job.web.DAO.AparcamientoBicebergDAO;
import es.open4job.web.VO.AparcamientoBicebergVO;

public class VerAparcamientoBicebergAction extends Action {

	public VerAparcamientoBicebergAction() {
		// TODO Auto-generated constructor stub
	}
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		AparcamientoBicebergDAO aparcamientoBicebergDAO = new AparcamientoBicebergDAO();

		List<AparcamientoBicebergVO> biceberg = aparcamientoBicebergDAO
				.getLstAparcamientoBiceberg();

		// añade el objeto al request para enviarlo al jsp
		request.setAttribute("biceberg", biceberg);

		// busca en struts.config.xml el succes_biceberg para abrir esa pagina jsp
		return mapping.findForward("success_biceberg");

	}

}
