
# react-native-goo-pay-button

## Getting started

`$ npm install react-native-goo-pay-button --save`

### Mostly automatic installation

`$ react-native link react-native-goo-pay-button`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNGooPayButtonPackage;` to the imports at the top of the file
  - Add `new RNGooPayButtonPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-goo-pay-button'
  	project(':react-native-goo-pay-button').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-goo-pay-button/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-goo-pay-button')
  	```

## Usage
```javascript
import RNGooPayButton from 'react-native-goo-pay-button';

// TODO: What to do with the module?
render() {
  return <RNGooglePayButton />
};
```
  # react-native-goo-pay-button
