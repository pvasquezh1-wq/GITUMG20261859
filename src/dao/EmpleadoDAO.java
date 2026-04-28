package dao;
import conexion.CreateConnection;
import model.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    private final CreateConnection connFactory= new CreateConnection();
    
    public Empleado obtenerId(int id){
        Empleado emp = null;
        
        try {
            String sql="select * from empleados where id=?";
            Connection conn=connFactory.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                emp = new Empleado(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("puesto"),
                    rs.getDouble("salario")
                );
            }
            
            ps.close();
            conn.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return emp;
    }
    
    
    
    public List<Empleado> consultar(){
        
        List<Empleado> lista=new ArrayList<>();
        String sql="select * from empleados";
        
        try (Connection conn=connFactory.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()){
            while(rs.next()){
                Empleado emp = new Empleado(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("puesto"),
                    rs.getDouble("salario")
                );
                lista.add(emp);
            }
            
            ps.close();
            conn.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return lista;
    }
        
    
    public boolean guardar(Empleado emp){
        String sql="insert into empleados(nombre,apellido,puesto,salario) values(?,?,?,?)";

        try(Connection conn=connFactory.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql)){
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApellido());
            ps.setString(3, emp.getPuesto());
            ps.setDouble(4, emp.getSalario());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            }
        return false;
        }
    
    public boolean update(Empleado emp){
    String sql = "UPDATE empleados SET nombre=?, apellido=?, puesto=?, salario=? WHERE id=?";

    try(Connection conn = connFactory.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){

        ps.setString(1, emp.getNombre());
        ps.setString(2, emp.getApellido());
        ps.setString(3, emp.getPuesto());
        ps.setDouble(4, emp.getSalario());
        ps.setInt(5, emp.getId());

        ps.executeUpdate();
        return true;

    } catch(SQLException e){
        e.printStackTrace();
    }

    return false;
}
    
     public boolean eliminar(int id){
    String sql = "DELETE FROM empleados WHERE id=?";

    try(Connection conn = connFactory.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){

        ps.setInt(1, id);
        ps.executeUpdate();
        return true;

    } catch(SQLException e){
        e.printStackTrace();
    }

    return false;
}
}