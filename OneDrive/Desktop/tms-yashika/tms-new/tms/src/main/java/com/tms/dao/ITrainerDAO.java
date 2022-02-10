/**
 * 
 */
package com.tms.dao;

import java.io.IOException;
import java.util.List;

import com.tms.beans.TrainerLogin;
import com.tms.beans.TrainerRegistration;

/**
 * @author ayushi
 *
 */
public interface ITrainerDAO {
	public boolean login(TrainerLogin login) throws ClassNotFoundException, IOException;
//	  public boolean insertTrainer(TrainerRegistration tr);
//	  public TrainerRegistration getTrainer(int trId);
//	  public boolean updateRegistration(int trId,double trFees);
//	  public void deleteTrainer(int trId);
//	  public List<TrainerRegistration> getTrainer(); 
}

