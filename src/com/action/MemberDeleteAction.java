package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.MemberService;

public class MemberDeleteAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private MemberService memberService;
	private long id;
	public MemberService getMemberService() {
		return memberService;
	}
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String execute() {
		memberService.delete(id);
		return SUCCESS;
	}
}
