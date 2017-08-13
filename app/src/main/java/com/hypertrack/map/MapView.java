package com.hypertrack.map;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;


public class MapView extends FrameLayout {
    public MapView(@NonNull Context context) {
        super(context);
    }

//    private Subject<GoogleMap> mapSubject;
//
//    public MapView(@NonNull Context context) {
//        super(context);
//        init(context, null);
//    }
//
//    public MapView(@NonNull Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//        init(context, attrs);
//    }
//
//    public MapView(@NonNull Context context, @Nullable AttributeSet attrs,
//                   @AttrRes int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        init(context, attrs);
//    }
//
//    private void init(Context context, AttributeSet attrs) {
//        SupportMapFragment mapFragment = SupportMapFragment.newInstance();
//
//        if (!isInEditMode()) {
//            FragmentTransaction fragmentTransaction =
//                    ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.add(getId(), mapFragment);
//            fragmentTransaction.commit();
//
//            mapSubject = BehaviorSubject.create();
//            Observable.create(
//                    (ObservableOnSubscribe<GoogleMap>) e -> mapFragment.getMapAsync(e::onNext))
//                    .subscribe(mapSubject);
//        }
//    }
//
//    public void addMarker(Location location) {
//        mapSubject.subscribe(googleMap -> {
//            LatLng position = new LatLng(location.getLatitude(), location.getLongitude());
//            googleMap.addMarker(new MarkerOptions()
//                    .position(position));
//            googleMap.moveCamera(CameraUpdateFactory.newLatLng(position));
//        });
//    }
}
