package com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Member;

public class MemberDAOImpl implements MemberDAO{
	
	private SessionFactory sessionFactory;
	
	public MemberDAOImpl(SessionFactory sessionFacory){
		this.sessionFactory = sessionFacory;
	}
	
	public Session currentSession(){
		return this.sessionFactory.openSession();
	}

	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub
		Session session = null;
		try{
			session = currentSession();
			Transaction tx = session.beginTransaction();
			session.save(member);
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Session session = null;
		try{
			session = currentSession();
			Transaction tx = session.beginTransaction();
			Member mb = (Member)session.get(Member.class, id);
			session.delete(mb);			
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		Session session = null;
		List<Member> result = null;
		try{
			session = currentSession();
			Transaction tx = session.beginTransaction();
			String hsql = "from Member";
			Query query = session.createQuery(hsql);
			result = query.list();
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}

	@Override
	public Member findById(long id) {
		// TODO Auto-generated method stub
		Session session = null;
		Member result = null;
		try{
			session = currentSession();
			Transaction tx = session.beginTransaction();
			String hsql = "from Member m where m.id=:id";
			Query query = session.createQuery(hsql);
			query.setParameter("id", id);
			result = (Member)query.uniqueResult();
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}

	@Override
	public Member findByName(String name, String password) {
		// TODO Auto-generated method stub
		Session session = null;
		Member result = null;
		try{
			session = currentSession();
			Transaction tx = session.beginTransaction();
			String hsql = "from Member m where m.name=:mname and m.password=:mpassword";
			Query query = session.createQuery(hsql);
			query.setParameter("mname", name);
			query.setParameter("mpassword", password);
			result = (Member)query.uniqueResult();
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		Session session = null;
		try{
			session = currentSession();
			Transaction tx = session.beginTransaction();
			session.update(member);
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
