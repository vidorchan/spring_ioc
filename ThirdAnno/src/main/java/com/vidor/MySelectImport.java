package com.vidor;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class MySelectImport implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //以字符串的形式注册多个Bean
        //此处必须是全类名
        //getBean使用时必须类名.class,字符串名获取不到
        return new String[]{"com.vidor.model.Person"};
    }
}
