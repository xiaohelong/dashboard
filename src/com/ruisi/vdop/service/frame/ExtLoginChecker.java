package com.ruisi.vdop.service.frame;

import javax.servlet.ServletContext;

import com.ruisi.ext.engine.control.sys.LoginSecurityAdapter;
import com.ruisi.ext.engine.dao.DaoHelper;
import com.ruisi.ext.engine.wrapper.ExtRequest;
import com.ruisi.ext.engine.wrapper.ExtResponse;
import com.ruisi.vdop.bean.User;
import com.ruisi.vdop.util.VdopConstant;

public class ExtLoginChecker implements LoginSecurityAdapter {

	public boolean loginChk(ExtRequest req, ExtResponse arg1, ServletContext ctx, DaoHelper arg2) {
		/**
		User user = (User)req.getSession().getAttribute(VdopConstant.USER_KEY_IN_SESSION);
		if(user == null){
			return false;
		}else{
			return true;
		}
		**/
		return true;
	}

}
