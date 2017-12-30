package srongklod_bangtamruat.plantseconomic.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import srongklod_bangtamruat.plantseconomic.R;
import srongklod_bangtamruat.plantseconomic.utility.CustomerModel;

/**
 * Created by masterung on 29/12/2017 AD.
 */

public class ShowAllFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create ListView
        createListView();

    }   // Main Method

    private void createListView() {
        ListView listView = getView().findViewById(R.id.listViewShowAll);
        final String tag = "29DecV1";
        final int[] intTimes = {0};

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Customer");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                int i = (int) dataSnapshot.getChildrenCount();
                ArrayList<String> stringArrayList = new ArrayList<String>();
                List list = new ArrayList();

                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {


                    CustomerModel customerModel = dataSnapshot1.getValue(CustomerModel.class);
                    list.add(customerModel);

                    CustomerModel customerModel1 = (CustomerModel) list.get(intTimes[0]);
                    Log.d(tag, "test Name ==> " + customerModel1.getNameString());
                    intTimes[0] += 1;
                }   // for

                Log.d(tag, "List ==> " + list.toString());



                String[] nameStrings = new String[(int) dataSnapshot.getChildrenCount()];




                for (int i1=0; i1<dataSnapshot.getChildrenCount(); i1+=1) {

                    CustomerModel customerModel = dataSnapshot.getValue(CustomerModel.class);

                    nameStrings[i1] = customerModel.getNameString();
                    Log.d(tag, "nameString[" + i1 + "] ==> " + nameStrings);

                    stringArrayList.add(customerModel.getNameString());


                }

                Log.d(tag, "stringArrayList ==> " + stringArrayList.toString());
                Log.d(tag, "Times ==> " + intTimes[0]);
                Log.d(tag, "i ==> " + i);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




    }   // createListview

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_all, container, false);
        return view;
    }
}
