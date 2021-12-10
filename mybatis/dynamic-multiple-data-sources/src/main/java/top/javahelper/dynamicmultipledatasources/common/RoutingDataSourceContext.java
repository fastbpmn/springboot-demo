package top.javahelper.dynamicmultipledatasources.common;

/**
 * @description: 数据源 key 上下文
 * 通过控制ThreadLocal变量 LOOKUP_KEY_HOLDER 的值用于控制数据源切换
 * @see RoutingDataSource
 * @projectName:dynamic-multiple-data-sources
 * @see:top.javahelper.dynamicmultipledatasources.common
 * @author:郑晓龙
 * @createTime:2021/12/3 16:43
 * @version:1.0
 */
public class RoutingDataSourceContext {
    private static final ThreadLocal<String> LOOKUP_KEY_HOLDER = new ThreadLocal<>();

    public static String getRoutingKey() {
        String key = LOOKUP_KEY_HOLDER.get();
        // 默认返回第一个数据源
        return key == null ? "first" : key;
    }

    public static void setRoutingKey(String routingKey) {
        LOOKUP_KEY_HOLDER.set(routingKey);
    }

    public static void reset() {
        LOOKUP_KEY_HOLDER.remove();
    }
}