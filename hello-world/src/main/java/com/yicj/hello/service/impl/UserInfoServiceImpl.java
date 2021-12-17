package com.yicj.hello.service.impl;

import com.yicj.hello.dao.UserInfoDao;
import com.yicj.hello.model.UserInfo;
import com.yicj.hello.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public Iterable<UserInfo> findAll() {

        return userInfoDao.findAll();
    }

    @Override
    public void save(List<UserInfo> list) {
        list = new ArrayList<>();

        String namess = "帆乘   楷栋   锋枫   海勇   康帆   安礼   晓平   良帆   瑞翱   涛锟   恒勇   鸿驰   帆强   桓柏   锋寅   博槐   骞琛   桓钊   杰桓   裕枫   福晖   槐仕   奇鹏   骏伟   允潍   乘初   杞郁   柏安   皓宇   骏侠   礼德   哲晓   伟权   祥恒   澄震   浩浩   瑞权   延升   翱楷   锋轩   驰鹏   杞翱   康鹤   材福   晖锐   信恒   凯锦   诚翱   震福   龙宇   祥帆   梓瑞   林龙   日延   槐翰   日寅   起鸿   杞允   瑞锐   仕星   权铭   吉楷   寅星   林帝   皓仕   卓礼   家盛   海寅   盛胤   年禧   畅安   炳龙   柏晖   诚年   彬坤   礼诚   濡凯   驰晨   恒邦   帆晖   诚华   晖星   恒梓   禄彬   鹤华   锟升   桓浩   振尧   祥寅   楷辰   暄帝   锐梓   恒佑   文安   杰畅   加琛   俊泽   乘驰   禄家   中鹤   家锦   皓初   凯震   文韦   彬澄   起哲   海炳   鹤锋   贤逸   哲佑   海信   逸俊   炳年   礼郁   濡寅   晓泽   然延   喆加   天梓   泽锟   轩谛   盛翱   晨子   诚吉   梁鹤   仕逸   升平   奇琛   杞沛   胤邦   辰佑   骞佳   鸿鹏   翱坤   钊峰   哲锐   腾鑫   海阳   烁奇   安芃   浩瑞   星尧   驰炳   安沛   权成   华文   杞晨   柏柔   权彬   祯晨   谛潍   驰安   安日   谷沛   帆华   林翰   然震   琛星   泽杞   澄涛   龙欣   嘉辰   海禄   诚家   帆韦   澄濡   潍延   郁邦   锐礼   蔓材   畅震   腾诚   峰贤   轩潍   凡信   翱年   祜帆   睿吉   祯博   强延   震鑫   邦郁   禧祯   良梁   烁谛   成震   翱颜   加升   荣俊   晨骞   锦槐   烁安   鑫平   沛凯   德升   炳宇   远侠   晖鹏   腾谷   初帆   林然   中禄   斌颜   颜浩   远帆   胤然   祜沛   允锟   畅梁   栋材   泽柔   远锐   杞梁   凯濡   郁槐   家泽   暄乘   年权   文柏   潍禧   澄禧   奇锦   逸然   翰弘   华海   柏辞   瑞星   胤佑   芃嘉   祜胤   逸杰   杰逸   材龙   允升   加韦   逸福   桓辞   枫濡   信然   栋祯" +
                "蓓菡   娜嘉   碧珊   菲昕   芸帆   怡莉   鸿莲   曦静   灵玥   橘婧   家曼   鹤丽   岚琳   格梅   呈梦   璇嘉   月欣   楠敏   瑶丽   茹莲   杉歆   帆珍   琬彬   蓓昭   函璇   凌欢   歆蔚   妮萱   琛灵   婷媛   琳凌   岚冬   静鸿   珍倩   桂枫   玉岚   紫涵   桃婧   芳璟   韵珠   香萱   冰梅   桂寒   呈曼   梅茹   雯帆   芙明   紫桂   霞玲   蓓莉   霞可   琪香   菲春   美俊   梦栀   鹤婧   帛菲   静芝   琳沛   玥薇   璟漫   弦茹   彦茜   花梓   歆曦   寒洁   莉梓   颖芙   梓露   玉诗   桃橘   鹤霞   沛漫   月婧   玲阳   雅欢   珍月   璟紫   歆淑   韵琬   月玉   欢彦   寒娅   妍彤   梦萱   蕾芳   心彤   彩妮   寒玲   淑漫   茜桐   春楠   洲茜   月嘉   欣云   珠香   岚韵   娜呈   妮弦   芸函   芳寒   萱林   云琳   莲菡   碧娅   莉凌   栀茜   蔚妮   惠婧   香心   初莉   颖淑   凡芝   璇灵   可蕾   静文   彩鹤   芙鑫   花楠   云梦   菲茹   蓓玥   惠娅   凌芳   柔旭   琛楠   雪娜   蕾诗   芸珠   菡桂   蕾文   桃花   彩诗   彬洁   帆馨   雯春   芝韵   春雅   静紫   寒橘   冰淑   韵露   昭莲   诗晨   钰花   彩月   昕欢   香可   菲婧   橘静   钰韵   霞心   彬雅   芙春   菲惠   萱曦   惠枫   舒薇   楠丽   栀珍   琳惠   歆冬   漫月   莲琛   琬梓   雨美   梦家   倩慧   俊薇   彬璇   敏玉   栀曼   曦倩   蓓蔚   月茜   俊珍   茹帆   璐欢   芝珊   昕舒   娅璐   慧玉   春玥   舒静   颖楠   淑紫   漫彩   欢曼   芳歆   桂冰   芙薇   旭雅   璇冰   岚欣   岚玲   慧锦   克霞   萱丽   采碧   洁昭   采彩   珊云   漫梦   萱凌   怡文   霞杉   敏怡   莉怡   怡露   格漫   瑶薇   沛菲   彦梦   妮馨   菲萱   敏桐   鹤菡   彬蓓   凌彤   珊莉   漫依   琪莲   欣霞   璟心   梅薇   寒蓓   倩梓   采娜   琬雯   枫梅   花格   馨可   杉璐   舒娅   沛香   颖茹   格玲   花柏   雨璟   欣薇";

        String[] names = namess.split("\\s+");

        String[] descArr = {
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，中华人民共和国国歌",
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，是老师大家好",
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，我们都是中国人",
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，他们也是中国人",
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，你们不是中国人",
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，他们是中国人么",
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，测试大家好",
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，中国制造",
                "大家都说我是个阳光女孩，因为我是开心果啊。我老是坐不住，呵呵，能跟小椅子成为好朋友，这里测试一下",
        };

        Random random = new Random();

        //模拟数据
        for (int i = 0; i < descArr.length; i++) {
            //int i1 = random.nextInt(names.length);
            //int i2 = random.nextInt(descArr.length);
            //注意这里 第一个参数是id 所以无论你运行多少次，都只会添加100条数据，如果id存在es更新，不存在添加
            UserInfo testBean = new UserInfo(i, names[i], i, String.valueOf(i % 2), descArr[i]);
            list.add(testBean);
        }

        userInfoDao.saveAll(list);
    }

    @Override
    public void save(UserInfo bean) {
        userInfoDao.save(bean);
    }

    @Override
    public List<UserInfo> findByName(String text) {
        return userInfoDao.findByName(text);
    }

    @Override
    public List<UserInfo> findByNameOrDesc(String name, String desc) {
        return userInfoDao.findByNameOrDesc(name, desc);
    }
}