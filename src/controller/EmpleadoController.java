package controller;

import dao.EmpleadoDAO;
import java.util.List;
import model.Empleado;

public class EmpleadoController {

    private EmpleadoDAO dao = new EmpleadoDAO();

    public void agregarEmpleado(String nombre, String apellido, String puesto, double salario) {
        Empleado emp = new Empleado(0, nombre, apellido, puesto, salario);
        dao.guardar(emp);
    }

    public List<Empleado> obtenerEmpleado() {
        return dao.consultar();
    }

    public void actualizarEmpleado(int id, String nombre, String apellido, String puesto, double salario) {
        Empleado emp = new Empleado(id, nombre, apellido, puesto, salario);
        dao.update(emp);
    }

    public void eliminarEmpleado(int id) {
        dao.eliminar(id);
    }
}