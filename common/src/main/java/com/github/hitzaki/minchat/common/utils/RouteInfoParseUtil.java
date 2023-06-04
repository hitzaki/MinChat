package com.github.hitzaki.minchat.common.utils;


import com.github.hitzaki.minchat.common.BaseErrorCode;
import com.github.hitzaki.minchat.common.exception.ApplicationException;
import com.github.hitzaki.minchat.common.route.RouteInfo;

/**
 *
 * @since JDK 1.8
 */
public class RouteInfoParseUtil {

    public static RouteInfo parse(String info){
        try {
            String[] serverInfo = info.split(":");
            RouteInfo routeInfo =  new RouteInfo(serverInfo[0], Integer.parseInt(serverInfo[1])) ;
            return routeInfo ;
        }catch (Exception e){
            throw new ApplicationException(BaseErrorCode.PARAMETER_ERROR) ;
        }
    }
}
