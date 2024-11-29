import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "myServlet", value = "/myServlet", initParams = {@WebInitParam(name = "encoding", value = "UTF-8")})
public class myServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");  // 设置响应的字符编码
        response.setContentType("text/html; charset=utf-8");  // 设置响应类型

        Cookie[] cookies = request.getCookies();
        boolean flag = false;

        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if ("lastTime".equals(name)) {
                    flag = true;
                    String value = cookie.getValue();
                    System.out.println("解码前：" + value);
                    value = URLDecoder.decode(value, "utf-8");
                    System.out.println("解码后：" + value);
                    response.getWriter().write("欢迎回来，您上次访问时间为：" + value);

                    Date date = new Date();
                    SimpleDateFormat timesdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_time = timesdf.format(date);
                    System.out.println("编码前：" + str_time);
                    str_time = URLEncoder.encode(str_time, "utf-8");
                    System.out.println("编码后：" + str_time);

                    cookie.setValue(str_time);
                    cookie.setMaxAge(70 * 24 * 60 * 60); // 70 days
                    response.addCookie(cookie);
                    break;
                }
            }
        }
        if (cookies == null || cookies.length == 0 || !flag) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);
            System.out.println("编码前:" + str_date);
            str_date = URLEncoder.encode(str_date, "utf-8");
            System.out.println("编码后：" + str_date);

            Cookie cookie = new Cookie("lastTime", str_date);
            cookie.setMaxAge(70 * 24 * 60 * 60); // 70 days
            response.addCookie(cookie);
            response.getWriter().write("您好，欢迎您首次访问");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doGet(request, response);
    }
}
