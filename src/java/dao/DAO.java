/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import entity.Account;
import entity.Post;
import entity.Topic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DAO extends DBContext{

    //Khai báo các thành phần xử lý DB
    Connection cnn;//Kết nối DB
    PreparedStatement ps;//Thực hiện các câu lệnh SQL
    ResultSet rs;//Lưu trữ và xử lý dữ liệu lấy về từ select

    public List<Post> getAllPost() {
        List<Post> list = new ArrayList<>();
        String query = "select * from post";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Post(rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Topic> getAllTopic() {
        List<Topic> list = new ArrayList<>();
        String query = "select * from topic";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Topic(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from account";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Topic getTopicName(String topID) {
        String query = "select top 1 * from Topic\n"
                + "where topID = ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, topID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Topic(rs.getInt(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Post getLast() {
        String query = "select top 1 * from post\n"
                + "order by post.date desc";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Post(rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Post> getPostbyTopic(String topID) {
        List<Post> list = new ArrayList<>();
        String query = "select * from Post\n"
                + "where topID = ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, topID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Post(rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Post getPostID(String id) {
        String query = "select * from Post\n"
                + "where id = ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Post(rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Post> searchTopicbyTitle(String txtSearch) {
        List<Post> list = new ArrayList<>();
        String query = "select * from Post p\n"
                + "where p.title like ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Post(rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Account login(String user, String pass) {
        String query = "select * from Account \n"
                + "where [user] like ? and pass like ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExist(String user) {
        String query = "select * from Account \n"
                + "where [user] like ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void signUp(String user, String pass) {
        String query = "insert into account \n"
                + "values (?,?,0,0)";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Post> getAllPostByUser(int id) {
        List<Post> list = new ArrayList<>();
        String query = "SELECT * FROM Post\n"
                + "WHERE postID = ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Post(rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteAccount(String uID) {
        String query = "delete from account "
                + "where uID = ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, uID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deletePostFromAll(String id) {
        String query = "delete from post "
                + "where id = ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deletePost(String id) {
        String query = "delete from post "
                + "where id = ?";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertAccount(String user, String pass) {
        String query = "insert into account \n"
                + "values (?,?,1,1)";
        try {
            cnn = connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Post> list = dao.getAllPost();
        List<Topic> listT = dao.getAllTopic();

//        Test Post
//        for (Post o : list) {
//            System.out.println(o);
//        }
        for (Topic o : listT) {
            System.out.println(o);
        }
    }
}
