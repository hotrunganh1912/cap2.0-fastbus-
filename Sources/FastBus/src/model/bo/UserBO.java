/**
 * @FileName	: UserBO.java
 *
 * @Version		: 1.0
 *
 * @Copyright
 *
 * @Modification Logs:
 *
 * DATE				AUTHOR				DESCRIPTION
 * -------------------------------------------------
 * Sep 8, 2019			QuocLH				Create
 */


package model.bo;

import java.util.List;

import model.bean.User;
import model.dao.UserDAO;

public class UserBO {
	public List<User> getListUsersBO() {
		return new UserDAO().getListUsersDAO();
	}
}