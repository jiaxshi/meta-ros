# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by     sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud     or sensor_msgs/PointCloud2. In particular, it contains functionality to account     for the skew resulting from moving robots or tilting laser scanners."
AUTHOR = "Dharini Dutia <dharini@openrobotics.org>"
ROS_AUTHOR = "Dave Hershberger <dave.hershberger@sri.com>"
HOMEPAGE = "http://ros.org/wiki/laser_geometry"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "laser_geometry"
ROS_BPN = "laser_geometry"

ROS_BUILD_DEPENDS = " \
    libeigen \
    rclcpp \
    sensor-msgs \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    eigen3-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    eigen3-cmake-module-native \
"

ROS_EXEC_DEPENDS = " \
    python3-numpy \
    rclcpp \
    rclpy \
    sensor-msgs \
    sensor-msgs-py \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-gtest \
    ament-cmake-lint-cmake \
    ament-cmake-pytest \
    ament-cmake-uncrustify \
    python-cmake-module \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/laser_geometry-release/archive/release/jazzy/laser_geometry/2.7.0-3.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/laser_geometry"
SRC_URI = "git://github.com/ros2-gbp/laser_geometry-release;${ROS_BRANCH};protocol=https"
SRCREV = "37dcc4181306237a30f6d7139d4ba9a148b2e592"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
