# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Provides conversion functions to and from Open3D datatypes"
AUTHOR = "Pranay Mathur <matnay17@gmail.com>"
ROS_AUTHOR = "Pranay Mathur <matnay17@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "perception_open3d"
ROS_BPN = "open3d_conversions"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopen3d-dev} \
    libeigen \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopen3d-dev} \
    libeigen \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopen3d-dev} \
    libeigen \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/perception_open3d-release/archive/release/jazzy/open3d_conversions/0.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/open3d_conversions"
SRC_URI = "git://github.com/ros2-gbp/perception_open3d-release;${ROS_BRANCH};protocol=https"
SRCREV = "937b8a0b27b2f6fe864b553f2422b37d6f34839c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
