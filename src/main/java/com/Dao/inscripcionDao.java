package com.Dao;

import com.Entidades.Carreras;
import com.Entidades.Estudiante;
import com.Entidades.Notas;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Util.HibernateUtil;
import java.util.List;

public class inscripcionDao {

    public void agregaRegistro(Estudiante estudiante, Notas notas, Carreras carreras) {
        Session session = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {

            t.begin();

        } catch (Exception e) {
            t.rollback();;
        } finally {
            session.close();
        }

    }

    public List<Estudiante> listaEstudiante() {
        List<Estudiante> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Estudiante";
        try {
            lista = session.createQuery(hql).list();
            t.commit();

            session.close();
        } catch (Exception e) {
            t.rollback();
        }

        return lista;
    }

    public List<Carreras> listaCarreras() {
        List<Carreras> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Carreras";
        try {
            lista = session.createQuery(hql).list();
            t.commit();
            session.close();
        } catch (Exception e) {
            t.rollback();
        }

        return lista;
    }

    public List<Notas> listaNotas() {
        List<Notas> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Notas";
        try {
            lista = session.createQuery(hql).list();
            t.commit();
            session.close();
        } catch (Exception e) {
            t.rollback();
        }

        return lista;
    }
}
