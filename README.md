# Motion Hourglass

Demonstration of several MotionLayout concepts and features working together:

* Each ConstraintSet denotes the various states of the hourglass while keeping the vertical or horizontal chain packed.
* Some Constraints are specifying a pathMotionArc to get the curved path of motion.
* ImageFilterView is used with a CustomAttribute property transition on `crossfade` to change how the sand appears.
* A simple rotation transformation keeps both the glass and sand rotating along their respective paths.
* The sand is constrainted by the glass
* KeyFrameSets adjust for alpha and rotation quirks to keep the ends of the animation from glitching
* autoTransition starts the animation and keeps it going forever

<img src="https://user-images.githubusercontent.com/1414364/58067733-6f897d80-7b5c-11e9-8468-fdff38c4d74e.gif" height="360" width="180" >
