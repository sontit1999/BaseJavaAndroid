package com.example.testphonefirebase.fragment;

import android.app.Application;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.testphonefirebase.adapter.RecipeAdapter;
import com.example.testphonefirebase.model.Recipe;
import com.example.testphonefirebase.model.User;
import com.example.testphonefirebase.adapter.UserAdapter;
import com.example.testphonefirebase.base.BaseViewmodel;

import java.util.ArrayList;

public class Fragviewmodel extends BaseViewmodel {
    public RecipeAdapter recipeAdapter = new RecipeAdapter();
    MutableLiveData<ArrayList<Recipe>> arrRecipe = new MutableLiveData<>();
    public Fragviewmodel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<ArrayList<Recipe>> getRecipe(){
        ArrayList<Recipe> arr = new ArrayList<>();
        arr.add(new Recipe("Chân gà nướng","MÓn này ngon tuyệt cú mèo luôn !" , "https://amthuc3mien.vn/wp-content/uploads/2019/01/chan-ga-muoi-ot.jpg","https://amthuc3mien.vn/cach-lam-chan-ga-nuong-muoi-ot-gion-ngon-ma-khong-he-bi-chay/","2","Sơn tít dz"));
        arr.add(new Recipe("Chân gà nướng","MÓn này ngon tuyệt cú mèo luôn !" , "http://www.oprah.com/g/image-resizer?width=670&link=http://static.oprah.com/images/201302/orig/201302-orig-beautiful-flatbread-600x411.jpg","https://amthuc3mien.vn/cach-lam-chan-ga-nuong-muoi-ot-gion-ngon-ma-khong-he-bi-chay/","2","Sơn tít dz"));
        arr.add(new Recipe("Chân gà nướng","MÓn này ngon tuyệt cú mèo luôn !" , "http://www.nogarlicnoonions.com/images/article_images/2016-11/divvy-abc-achrafieh482016-11-13-09-56-44.jpg","https://amthuc3mien.vn/cach-lam-chan-ga-nuong-muoi-ot-gion-ngon-ma-khong-he-bi-chay/","2","Sơn tít dz"));
        arr.add(new Recipe("Chân gà nướng","MÓn này ngon tuyệt cú mèo luôn !" , "https://res.cloudinary.com/twenty20/private_images/t_watermark-criss-cross-10/v1539028342000/photosp/7b984ced-532b-4850-9685-ada7bb6fdfb4/stock-photo-food-beautiful-photoshoot-iphonephotography-bulgaria-chef-life-cooking-at-home-delicious-food-lyoto-7b984ced-532b-4850-9685-ada7bb6fdfb4.jpg","https://amthuc3mien.vn/cach-lam-chan-ga-nuong-muoi-ot-gion-ngon-ma-khong-he-bi-chay/","2","Sơn tít dz"));
        arrRecipe.postValue(arr);
        return arrRecipe;
    }
    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }

}
