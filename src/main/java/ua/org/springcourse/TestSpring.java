package ua.org.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer firstmusicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondmusicPlayer =context.getBean("musicPlayer",MusicPlayer.class);

        boolean comparison = firstmusicPlayer==secondmusicPlayer;
        System.out.println(comparison);
        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);

        firstmusicPlayer.setVolume(10);

        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
