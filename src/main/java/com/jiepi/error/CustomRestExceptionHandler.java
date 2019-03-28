package com.jiepi.error;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@ControllerAdvice
public class CustomRestExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
                                         Exception ex) {
        CustomException ce;
        //判断ex异常类型是否为CustomException,如果是就将其赋给CustomException对象，如果不是new一个未知异常
        if(ex instanceof CustomException){
            ce=(CustomException)ex;
        }else{
            ce=new CustomException("未知异常");
        }
        //将错误信息放入请求作用域中
        request.setAttribute("message", ce.getMessage());
        try {
            //进行页面的跳转，跳转到错误信息页面
            request.getRequestDispatcher("/WEB-INF/student/error.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        return new ModelAndView();
    }


}
