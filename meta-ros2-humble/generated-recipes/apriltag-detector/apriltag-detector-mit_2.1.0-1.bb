# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS package for apriltag detection with MIT detector"
AUTHOR = "Bernd Pfrommer <bernd.pfrommer@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=c93e37fc0c6f510db5735eb91dcc1550"

ROS_CN = "apriltag_detector"
ROS_BPN = "apriltag_detector_mit"

ROS_BUILD_DEPENDS = " \
    apriltag-detector \
    apriltag-mit \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    ament-cmake-native \
    ament-cmake-ros-native \
    ros-environment-native \
"

ROS_EXPORT_DEPENDS = " \
    apriltag-detector \
    apriltag-mit \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    apriltag-detector \
    apriltag-mit \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-clang-format \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/apriltag_detector-release/archive/release/humble/apriltag_detector_mit/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/apriltag_detector_mit"
SRC_URI = "git://github.com/ros2-gbp/apriltag_detector-release;${ROS_BRANCH};protocol=https"
SRCREV = "e41c4745aac52df5dd8cff88ce85b37a0acb0141"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
