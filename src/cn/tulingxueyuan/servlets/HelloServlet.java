package cn.tulingxueyuan.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 判断是什么请求  进行请求方法的调度  login()   regiester();
        if(req.getParameter("action").equals("login")){
            login(req,resp);
        }
    }

    /**
     * 登录
     * @param req
     * @param resp
     */
    private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");

        // 获取的参数
        String username = req.getParameter("username");
        System.out.println(username);
        // 将参数拼装到JavaBean
        // 请求数据库
        // 响应
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
