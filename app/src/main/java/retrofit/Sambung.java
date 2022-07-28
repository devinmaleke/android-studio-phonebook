package retrofit;

import com.example.uas.Employees;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Sambung {
    @GET("?nim=2301893070&nama=Devin%20Akwila%20Maleke")
    Call<Employees> getdataset();
}
