package filters;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Authentication implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
            //this code will execute before the servlet
            HttpServletRequest httpRequest = (HttpServletRequest)request;
            HttpSession session = httpRequest.getSession();
            String email = (String)session.getAttribute("email");
            
            if(email == null){
                HttpServletResponse httpResponse = (HttpServletResponse)response;
                httpResponse.sendRedirect("login");
                return;
            }
            
            chain.doFilter(request, response); // forward onto servlet, or next fliter
            
            //this code will execute after the servlet
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {   
    }

    @Override
    public void destroy() {
    }
    
}
