package com.jit.JDBCSP.model;

import java.util.Date;

public class EmployeeLeave {
	private Integer EMPLEAVE_ID ;                            
	 private Integer EMPLOYEE_ID ;                               
	private Date LEAVE_START_DT;                                    
	private Date LEAVEAPPLY_DT;                                     
	private Date LEAVEEND_DT;                                        
	private Date MAX_LEAVE;
	public EmployeeLeave() {
		super();
	}
	public EmployeeLeave(Integer eMPLEAVE_ID, Integer eMPLOYEE_ID, Date lEAVE_START_DT, Date lEAVEAPPLY_DT,
			Date lEAVEEND_DT, Date mAX_LEAVE) {
		super();
		EMPLEAVE_ID = eMPLEAVE_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		LEAVE_START_DT = lEAVE_START_DT;
		LEAVEAPPLY_DT = lEAVEAPPLY_DT;
		LEAVEEND_DT = lEAVEEND_DT;
		MAX_LEAVE = mAX_LEAVE;
	}
	public Integer getEMPLEAVE_ID() {
		return EMPLEAVE_ID;
	}
	public void setEMPLEAVE_ID(Integer eMPLEAVE_ID) {
		EMPLEAVE_ID = eMPLEAVE_ID;
	}
	public Integer getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(Integer eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public Date getLEAVE_START_DT() {
		return LEAVE_START_DT;
	}
	public void setLEAVE_START_DT(Date lEAVE_START_DT) {
		LEAVE_START_DT = lEAVE_START_DT;
	}
	public Date getLEAVEAPPLY_DT() {
		return LEAVEAPPLY_DT;
	}
	public void setLEAVEAPPLY_DT(Date lEAVEAPPLY_DT) {
		LEAVEAPPLY_DT = lEAVEAPPLY_DT;
	}
	public Date getLEAVEEND_DT() {
		return LEAVEEND_DT;
	}
	public void setLEAVEEND_DT(Date lEAVEEND_DT) {
		LEAVEEND_DT = lEAVEEND_DT;
	}
	public Date getMAX_LEAVE() {
		return MAX_LEAVE;
	}
	public void setMAX_LEAVE(Date mAX_LEAVE) {
		MAX_LEAVE = mAX_LEAVE;
	}
	@Override
	public String toString() {
		return "EmployeeLeave [EMPLEAVE_ID=" + EMPLEAVE_ID + ", EMPLOYEE_ID=" + EMPLOYEE_ID + ", LEAVE_START_DT="
				+ LEAVE_START_DT + ", LEAVEAPPLY_DT=" + LEAVEAPPLY_DT + ", LEAVEEND_DT=" + LEAVEEND_DT + ", MAX_LEAVE="
				+ MAX_LEAVE + "]";
	}

}
