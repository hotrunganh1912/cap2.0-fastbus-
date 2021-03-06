/**
 * @FileName	: BusBO.java
 *
 * @Version		: 1.0
 *
 * @Copyright
 *
 * @Modification Logs:
 *
 * DATE				AUTHOR				DESCRIPTION
 * -------------------------------------------------
 * Dec 7, 2019			QuocLH				Create
 */

package model.bo;

import java.util.List;

import model.bean.Bus;
import model.dao.BusDAO;

public class BusBO {

	public List<Bus> getListBusByEmailBusinessBO(String email) {
		return new BusDAO().getListBusByEmailBusinessDAO(email);
	}
	public List<Bus> loadListBusByIdBusiness(String idBusiness) {
		return new BusDAO().loadListBusByIdBusiness(idBusiness);
	}
	public String insertBusBO(Bus bus) {
		return new BusDAO().insertBusBO(bus);
	}
}
