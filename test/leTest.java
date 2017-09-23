//import models.User;
//import org.junit.Assert;
//import org.junit.Test;
//import play.data.Form;
//import play.data.FormFactory;
//import play.test.WithApplication;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by alex on 2017-09-09.
// */
//public class leTest extends WithApplication {
//    private FormFactory formFactory() {
//        return app.injector().instanceOf(FormFactory.class);
//    }
//
//    @Test
//    public void usingForm() {
//        FormFactory formFactory = formFactory();
//
//        final // sneaky final
//                //#create
//                Form<User> userForm = formFactory.form(User.class);
//        //#create
//
//        //#bind
//        Map<String,String> anyData = new HashMap<>();
//        anyData.put("email", "bob@gmail.com");
//        anyData.put("password", "secret");
//
//        User user = userForm.bind(anyData).get();
//        //#bind
//
//        Assert.assertEquals(user.getEmail(), "bob@gmail.com");
//    }
//}
