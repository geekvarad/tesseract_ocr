package io.paratoner.tesseract_ocr_example;

//import android.os.Bundle;
//import io.flutter.app.FlutterActivity;
import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.embedding.engine.FlutterEngine;

public class MainActivity extends FlutterActivity {
  // @Override
  // protected void onCreate(Bundle savedInstanceState) {
  //   super.onCreate(savedInstanceState);
  //   GeneratedPluginRegistrant.registerWith(this);
  // }
  @Override
      public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
          GeneratedPluginRegistrant.registerWith(flutterEngine);
          // new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
          //         .setMethodCallHandler(
          //             (call, result) -> {
          //                 // Your existing code
          //         }
          // );
  }
}
